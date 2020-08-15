package com.github.lbovolini.mapper;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectMapper {

    private static final Map<String, Map<String, Method>> cacheGetters;
    private static final Map<String, Map<String, Method>> cacheSetters;

    static {
        cacheGetters = new ConcurrentHashMap<>();
        cacheSetters = new ConcurrentHashMap<>();
    }

    public static <T> T map(final Object object, final Class<?> aClass) {

        if (object == null || aClass == null) {
            throw new IllegalArgumentException("Object and class cannot be null");
        }

        Object result = newInstance(aClass);

        Map<String, Method> destinationObjectSetMethods = cacheSetters.get(aClass.getName());
        Map<String, Method> originObjectGetMethods = cacheGetters.get(object.getClass().getName());

        if (destinationObjectSetMethods == null) {
            destinationObjectSetMethods = new ConcurrentHashMap<>();
            getSetters(aClass, destinationObjectSetMethods);
            cacheSetters.put(aClass.getName(), destinationObjectSetMethods);
        }

        if (originObjectGetMethods == null) {
            originObjectGetMethods = new ConcurrentHashMap<>();
            getGetters(object.getClass(), originObjectGetMethods);
            cacheGetters.put(object.getClass().getName(), originObjectGetMethods);
        }

        Map<String, Method> originObjectGetMethodsFinal = originObjectGetMethods;

        destinationObjectSetMethods.forEach((name, method) -> {
            try {
                boolean nested = false;
                Method getterMethod = originObjectGetMethodsFinal.get(name);

                if (getterMethod == null) {
                    getterMethod = getGetterMethod(name, originObjectGetMethodsFinal);
                    nested = true;
                }

                if (getterMethod == null) {
                    return;
                }

                Object getterMethodResult = getterMethod.invoke(object);

                if (nested) {
                    getterMethodResult = map(getterMethodResult, method.getParameterTypes()[0]);
                }

                method.invoke(result, getterMethodResult);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });

        return (T)result;
    }

    private static Method getGetterMethod(String name, Map<String, Method> objectGetters) {
        if (name.length() > 3 && name.endsWith("dto")) {
            return objectGetters.get(removeSuffix(name));
        }
        return objectGetters.get(name + "dto");
    }

    private static void getGetters(final Class<?> aClass, Map<String, Method> objectGetters) {
        try {
            for (PropertyDescriptor propertyDescriptor: Introspector.getBeanInfo(aClass, Object.class).getPropertyDescriptors()) {
                Method method = propertyDescriptor.getReadMethod();
                objectGetters.put(removePrefix(method.getName().toLowerCase()), method);
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }

    private static void getSetters(final Class<?> aClass, Map<String, Method> objectSetters) {
        try {
            for (PropertyDescriptor propertyDescriptor: Introspector.getBeanInfo(aClass, Object.class).getPropertyDescriptors()) {
                Method method = propertyDescriptor.getWriteMethod();
                objectSetters.put(removePrefix(method.getName().toLowerCase()), method);
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }

    private static Object newInstance(Class<?> aClass) {
        try {
            Constructor constructor = aClass.getConstructor();
            return constructor.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    // remove get or set prefix
    private static String removePrefix(String string) {
        if (string.length() <= 3) {
            throw new IllegalArgumentException("Method name should have more than 3 characters");
        }

        return string.substring(3);
    }

    // remove dto suffix
    private static String removeSuffix(String string) {
        if (string.length() <= 3) {
            throw new IllegalArgumentException("Method name should have more than 3 characters");
        }

        return string.substring(0, string.length() - 3);
    }
}
