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

    private static final Map<String, Map> cacheGetters;
    private static final Map<String, Map> cacheSetters;

    static {
        cacheGetters = new ConcurrentHashMap<>();
        cacheSetters = new ConcurrentHashMap<>();
    }

    public static <T> T map(final Object object, final Class<?> aClass) {

        if (object == null || aClass == null) {
            throw new IllegalArgumentException("Object and class cannot be null");
        }

        Object o = null;
        try {
            Constructor constructor = aClass.getConstructor();
            o = constructor.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        Object result = o;

        Map<String, Method> destinationObjectSetMethods = cacheSetters.get(aClass.getName());
        Map<String, Method> originObjectGetMethods = cacheGetters.get(object.getClass().getName());

        if (destinationObjectSetMethods == null) {
            destinationObjectSetMethods = new ConcurrentHashMap<>();

            try {
                for (PropertyDescriptor propertyDescriptor: Introspector.getBeanInfo(aClass, Object.class).getPropertyDescriptors()) {
                    Method method = propertyDescriptor.getWriteMethod();
                    destinationObjectSetMethods.put(method.getName().substring(3).toLowerCase(), method);
                }
            } catch (IntrospectionException e) {
                e.printStackTrace();
            }

        }
        if (originObjectGetMethods == null) {
            originObjectGetMethods = new ConcurrentHashMap<>();

            try {
                for (PropertyDescriptor propertyDescriptor: Introspector.getBeanInfo(object.getClass(), Object.class).getPropertyDescriptors()) {
                    Method method = propertyDescriptor.getReadMethod();
                    originObjectGetMethods.put(method.getName().substring(3).toLowerCase(), method);
                }
            } catch (IntrospectionException e) {
                e.printStackTrace();
            }
        }

        cacheSetters.put(aClass.getName(), destinationObjectSetMethods);
        cacheGetters.put(object.getClass().getName(), originObjectGetMethods);

        Map<String, Method> originObjectGetMethodsFinal = originObjectGetMethods;

        destinationObjectSetMethods.forEach((name, method) -> {
            try {
                boolean nested = false;
                Method getMethod = originObjectGetMethodsFinal.get(name);
                if (getMethod == null) {
                    if (name.length() > 3 && name.endsWith("dto")) {
                        getMethod = originObjectGetMethodsFinal.get(name.substring(0, name.length() - 3));
                    }
                    else {
                        getMethod = originObjectGetMethodsFinal.get(name + "dto");
                    }
                    nested = true;
                }
                if (getMethod == null) {
                    return;
                }
                Object getMethodResult = getMethod.invoke(object);

                if (nested) {
                    getMethodResult = map(getMethodResult, method.getParameterTypes()[0]);
                }
                method.invoke(result, getMethodResult);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });

        return (T)result;
    }
}
