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
        return map(object, aClass, new HashSet<String>());
    }

    @SuppressWarnings("unchecked")
    private static <T> T map(final Object object, final Class<?> aClass, Set<String> stackTrace) {

        if (object == null) {
            return null;
        }

        if (aClass == null) {
            throw new IllegalArgumentException("Class cannot be null");
        }

        String trace = object.getClass().getName() + aClass.getName();
        if (stackTrace.contains(trace)) {
            return null;
        }
        stackTrace.add(trace);

        if (aClass.getName().equals(object.getClass().getName())) {
            return (T)object;
        }

        if (object instanceof Collection || object instanceof Map) {
            return map(object, aClass.getName(), stackTrace);
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

        for (Map.Entry<String, Method> entry: destinationObjectSetMethods.entrySet()) {

            String name = entry.getKey();
            Method method = entry.getValue();

            try {
                boolean nested = false;
                Method getterMethod = originObjectGetMethodsFinal.get(name);

                if (getterMethod == null) {
                    getterMethod = getGetterMethod(removeSuffix(name), originObjectGetMethodsFinal);
                    nested = true;
                }

                if (getterMethod == null) {
                    continue;
                }

                Object getterMethodResult = getterMethod.invoke(object);

                if (nested && getterMethodResult != null) {
                    Type[] types = method.getGenericParameterTypes();
                    String paramType = method.getParameterTypes()[0].getName();
                    if (isCollection(paramType)) {
                        String className = getClassName(types[0].toString());
                        getterMethodResult = map(getterMethodResult, className, stackTrace);
                    } else {
                        getterMethodResult = map(getterMethodResult, method.getParameterTypes()[0], stackTrace);
                    }
                }

                method.invoke(result, getterMethodResult);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return (T)result;
    }

    @SuppressWarnings("unchecked")
    private static <T> T map(final Object object, final String className, final Set<String> stackTrace) {

        if (object == null) {
            return null;
        }

        if (!(object instanceof Collection) && !(object instanceof Map)) {
            throw new UnsupportedOperationException("Supports only Collections and Map");
        }

        List<Object> resultList = new ArrayList<>();
        Set<Object> resultSet = new HashSet<>();
        Map<Object, Object> resultMap = new HashMap<>();

        if (object instanceof List) {
            for (Object o: (List<Object>)object) {
                try {
                    Set<String> stackTraceCopy = new HashSet<>(stackTrace);
                    resultList.add(map(o, Class.forName(className), stackTraceCopy));
                } catch (ClassNotFoundException e) {e.printStackTrace(); }
            }

            return (T)resultList;
        }
        if (object instanceof Set) {
            for (Object o : (Set<Object>) object) {
                try {
                    Set<String> stackTraceCopy = new HashSet<>(stackTrace);
                    resultSet.add(map(o, Class.forName(className), stackTraceCopy));
                } catch(ClassNotFoundException e){ e.printStackTrace(); }
            }

            return (T)resultSet;
        }

        Map<Object, Object> map = ((Map<Object, Object>)object);
        for (Map.Entry<Object, Object> entry: map.entrySet()) {
            try {
                String[] classNameArray = className.split(",");
                Set<String> stackTraceCopy = new HashSet<>(stackTrace);
                resultMap.put(map(entry.getKey(), Class.forName(classNameArray[0]), stackTraceCopy), map(entry.getValue(), Class.forName(classNameArray[1].replace(" ", "")), stackTraceCopy));
            } catch (ClassNotFoundException e) { e.printStackTrace(); }
        }

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
        for(Map.Entry<String, Method> entry: objectGetters.entrySet()) {
            objectGettersWithoutSuffix.put(removeSuffix(entry.getKey()), entry.getValue());
        }

        return objectGettersWithoutSuffix.get(name);
    }

    private static void getGetters(final Class<?> aClass, Map<String, Method> objectGetters) {
        try {
            for (PropertyDescriptor propertyDescriptor: Introspector.getBeanInfo(aClass, Object.class).getPropertyDescriptors()) {
                Method method = propertyDescriptor.getReadMethod();
                if (method == null) { continue; }
                objectGetters.put(removePrefix(method.getName().toLowerCase()), method);
            }
        } catch (IntrospectionException e) { e.printStackTrace(); }
    }

    private static void getSetters(final Class<?> aClass, Map<String, Method> objectSetters) {
        try {
            for (PropertyDescriptor propertyDescriptor: Introspector.getBeanInfo(aClass, Object.class).getPropertyDescriptors()) {
                Method method = propertyDescriptor.getWriteMethod();
                if (method == null) { continue; }
                objectSetters.put(removePrefix(method.getName().toLowerCase()), method);
            }
        } catch (IntrospectionException e) { e.printStackTrace(); }
    }

    private static Object newInstance(Class<?> aClass) {
        try {
            Constructor<?> constructor = aClass.getConstructor();
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
