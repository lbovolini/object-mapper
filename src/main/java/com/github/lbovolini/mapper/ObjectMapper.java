package com.github.lbovolini.mapper;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.*;
import java.util.*;
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

        if (aClass.getName().equals(object.getClass().getName())) {
            return (T)object;
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
                    getterMethod = getGetterMethod(removeSuffix(name), originObjectGetMethodsFinal);
                    nested = true;
                }

                if (getterMethod == null) {
                    return;
                }

                Object getterMethodResult = getterMethod.invoke(object);

                if (nested) {
                    Type[] types = method.getGenericParameterTypes();

                    String paramType = method.getParameterTypes()[0].getName();
                    if (isCollection(paramType)) {
                        String className = getClassName(types[0].getTypeName());
                        getterMethodResult = map(getterMethodResult, className);
                    } else {
                        getterMethodResult = map(getterMethodResult, method.getParameterTypes()[0]);
                    }
                }

                method.invoke(result, getterMethodResult);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });

        return (T)result;
    }

    private static <T> T map(final Object object, final String className) {

        if (!(object instanceof Collection) && !(object instanceof Map)) {
            throw new UnsupportedOperationException("Supports only Collections and Map");
        }

        List resultList = new ArrayList();
        Set resultSet = new HashSet();
        Map resultMap = new HashMap();

        if (object instanceof List) {
            ((List)object).forEach(item -> {
                try {
                    resultList.add(map(item, Class.forName(className)));
                } catch (ClassNotFoundException e) { e.printStackTrace(); }
            });

            return (T)resultList;
        }
        if (object instanceof Set) {
            ((Set)object).forEach(item -> {
                try {
                    resultSet.add(map(item, Class.forName(className)));
                } catch (ClassNotFoundException e) { e.printStackTrace(); }
            });

            return (T)resultSet;
        }

        ((Map)object).forEach((key, value) -> {
            try {
                String[] classNameArray = className.split(",");
                resultMap.put(map(key, Class.forName(classNameArray[0])), map(value, Class.forName(classNameArray[1].replace(" ", ""))));
            } catch (ClassNotFoundException e) { e.printStackTrace(); }
        });

        return (T)resultMap;
    }

    private static boolean isCollection(String paramType) {
        return "java.util.List".equals(paramType) || "java.util.Map".equals(paramType) || "java.util.Set".equals(paramType);
    }

    private static String getClassName(String typeName) {
        String t = typeName.substring(typeName.indexOf("<") + 1);
        int endIndex = t.indexOf("<");

        if (endIndex < 0) {
            endIndex = t.indexOf(">");
        }
        return t.substring(0, endIndex);
    }

    private static Method getGetterMethod(String name, Map<String, Method> objectGetters) {
        final Map<String, Method> objectGettersWithoutSuffix = new ConcurrentHashMap<>();
        objectGetters.forEach((key, value) -> {
            objectGettersWithoutSuffix.put(removeSuffix(key), value);
        });

        return objectGettersWithoutSuffix.get(name);
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
                if (method == null) continue;
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
        if (string == null) {
            throw new IllegalArgumentException("String argument cannot be null");
        }

        return string.replace("dto", "");
    }
}
