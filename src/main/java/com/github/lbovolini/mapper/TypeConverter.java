package com.github.lbovolini.mapper;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class TypeConverter {

    private static final Set<Class<?>> primitiveTypes = new HashSet<>();
    private static final Set<Class<?>> referenceTypes = new HashSet<>();

    static {
        primitiveTypes.add(boolean.class);
        primitiveTypes.add(byte.class);
        primitiveTypes.add(char.class);
        primitiveTypes.add(short.class);
        primitiveTypes.add(int.class);
        primitiveTypes.add(float.class);
        primitiveTypes.add(double.class);
        primitiveTypes.add(long.class);

        primitiveTypes.add(Boolean.class);
        primitiveTypes.add(Byte.class);
        primitiveTypes.add(Character.class);
        primitiveTypes.add(Short.class);
        primitiveTypes.add(Integer.class);
        primitiveTypes.add(Float.class);
        primitiveTypes.add(Double.class);
        primitiveTypes.add(Long.class);

        referenceTypes.add(String.class);
        referenceTypes.add(BigDecimal.class);
        referenceTypes.add(BigInteger.class);
    }

    public Object converter(Object object, Class<?> from, Class<?> to) {

        if (object == null || from == null || to == null) {
            return object;
        }

        if ((!primitiveTypes.contains(from) && !referenceTypes.contains(from))
                || (!primitiveTypes.contains(to) && !referenceTypes.contains(to))) {
            return object;
        }

        if (to.equals(String.class)) {
            return toStringA(object, from);
        }
        if (to.equals(boolean.class) || to.equals(Boolean.class)) {
            return toBoolean(object, from);
        }
        if (to.equals(byte.class) || to.equals(Byte.class)) {
            return toByte(object, from);
        }
        if (to.equals(char.class) || to.equals(Character.class)) {
            return toChar(object, from);
        }
        if (to.equals(short.class) || to.equals(Short.class)) {
            return toShort(object, from);
        }
        if (to.equals(int.class) || to.equals(Integer.class)) {
            return toInt(object, from);
        }
        if (to.equals(float.class) || to.equals(Float.class)) {
            return toFloat(object, from);
        }
        if (to.equals(double.class) || to.equals(Double.class)) {
            return toDouble(object, from);
        }
        if (to.equals(long.class) || to.equals(Long.class)) {
            return toLong(object, from);
        }
        if (to.equals(BigDecimal.class)) {
            return toBigDecimal(object, from);
        }
        if (to.equals(BigInteger.class)) {
            return toBigInteger(object, from);
        }

        return object;
    }

    private static String toStringA(Object object, Class<?> from) {

        if (referenceTypes.contains(from)) {
            return object.toString();
        }

        return String.valueOf(object);
    }

    private static Boolean toBoolean(Object object, Class<?> from) {

        if (from.equals(String.class)) {
            return Boolean.valueOf((String)object);
        }
        if (from.equals(BigDecimal.class)) {
            return Boolean.valueOf(object.toString());
        }
        if (from.equals(BigInteger.class)) {
            return Boolean.valueOf(object.toString());
        }

        return (boolean)object;
    }

    private static Byte toByte(Object object, Class<?> from) {

        if (from.equals(String.class)) {
            return Byte.valueOf((String)object);
        }
        else if (from.equals(BigDecimal.class)) {
            return Byte.valueOf(object.toString());
        }
        else if (from.equals(BigInteger.class)) {
            return Byte.valueOf(object.toString());
        }

        return (byte)object;
    }

    private static Character toChar(Object object, Class<?> from) {

        if (from.equals(String.class)) {
            return ((String) object).charAt(0);
        }
        else if (from.equals(BigDecimal.class)) {
            return object.toString().charAt(0);
        }
        else if (from.equals(BigInteger.class)) {
            return object.toString().charAt(0);
        }

        return (char)object;
    }

    private static Short toShort(Object object, Class<?> from) {

        if (from.equals(String.class)) {
            return Short.valueOf((String)object);
        }
        else if (from.equals(BigDecimal.class)) {
            return Short.valueOf(object.toString());
        }
        else if (from.equals(BigInteger.class)) {
            return Short.valueOf(object.toString());
        }

        return (short)object;
    }

    private static Integer toInt(Object object, Class<?> from) {

        if (from.equals(String.class)) {
            return Integer.valueOf((String) object);
        }
        else if (from.equals(BigDecimal.class)) {
            return Integer.valueOf(object.toString());
        }
        else if (from.equals(BigInteger.class)) {
            return Integer.valueOf(object.toString());
        }

        return (int)object;
    }

    private static Float toFloat(Object object, Class<?> from) {

        if (from.equals(String.class)) {
            return Float.valueOf((String)object);
        }
        else if (from.equals(BigDecimal.class)) {
            return Float.valueOf(object.toString());
        }
        else if (from.equals(BigInteger.class)) {
            return Float.valueOf(object.toString());
        }

        return (float)object;
    }

    private static Double toDouble(Object object, Class<?> from) {

        if (from.equals(String.class)) {
            return Double.valueOf((String)object);
        }
        else if (from.equals(BigDecimal.class)) {
            return Double.valueOf(object.toString());
        }
        else if (from.equals(BigInteger.class)) {
            return Double.valueOf(object.toString());
        }

        return (double)object;
    }

    private static Long toLong(Object object, Class<?> from) {

        if (from.equals(String.class)) {
            return Long.valueOf((String)object);
        }
        else if (from.equals(BigDecimal.class)) {
            return Long.valueOf(object.toString());
        }
        else if (from.equals(BigInteger.class)) {
            return Long.valueOf(object.toString());
        }

        return (long)object;
    }

    private static BigDecimal toBigDecimal(Object object, Class<?> from) {

        if (from.equals(String.class)) {
            return new BigDecimal((String) object);
        }
        else if (from.equals(BigInteger.class)) {
            return new BigDecimal(object.toString());
        }
        else if (from.equals(boolean.class) || from.equals(Boolean.class)) {
            return new BigDecimal((int)object);
        }
        else if (from.equals(byte.class) || from.equals(Byte.class)) {
            return new BigDecimal((byte)object);
        }
        else if (from.equals(char.class) || from.equals(Character.class)) {
            return new BigDecimal((char)object);
        }
        else if (from.equals(short.class) || from.equals(Short.class)) {
            return new BigDecimal((short)object);
        }
        else if (from.equals(int.class) || from.equals(Integer.class)) {
            return new BigDecimal((int)object);
        }
        else if (from.equals(float.class) || from.equals(Float.class)) {
            return BigDecimal.valueOf((float) object);
        }
        else if (from.equals(double.class) || from.equals(Double.class)) {
            return BigDecimal.valueOf((double) object);
        }
        else if (from.equals(long.class) || from.equals(Long.class)) {
            return new BigDecimal((long) object);
        }

        return (BigDecimal)object;
    }

    private static BigInteger toBigInteger(Object object, Class<?> from) {

        if (from.equals(String.class)) {
            return new BigInteger((String) object);
        }
        else if (from.equals(BigDecimal.class)) {
            return new BigInteger(object.toString());
        }

        return BigInteger.valueOf((long)object);
    }
}