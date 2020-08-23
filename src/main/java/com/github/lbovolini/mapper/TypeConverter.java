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

    @SuppressWarnings("unchecked")
    public static <T> T converter(Object object, Class<?> from, Class<?> to) {

        if (object == null || from == null || to == null) {
            return (T)object;
        }

        if ((!primitiveTypes.contains(from) && !referenceTypes.contains(from))
                || (!primitiveTypes.contains(to) && !referenceTypes.contains(to))) {
            return (T)object;
        }

        if (to.equals(String.class)) {
            return (T)toStringA(object, from);
        }
        if (to.equals(boolean.class) || to.equals(Boolean.class)) {
            return (T)toBoolean(object, from);
        }
        if (to.equals(byte.class) || to.equals(Byte.class)) {
            return (T)toByte(object, from);
        }
        if (to.equals(char.class) || to.equals(Character.class)) {
            return (T)toChar(object, from);
        }
        if (to.equals(short.class) || to.equals(Short.class)) {
            return (T)toShort(object, from);
        }
        if (to.equals(int.class) || to.equals(Integer.class)) {
            return (T)toInt(object, from);
        }
        if (to.equals(float.class) || to.equals(Float.class)) {
            return (T)toFloat(object, from);
        }
        if (to.equals(double.class) || to.equals(Double.class)) {
            return (T)toDouble(object, from);
        }
        if (to.equals(long.class) || to.equals(Long.class)) {
            return (T)toLong(object, from);
        }
        if (to.equals(BigDecimal.class)) {
            return (T)toBigDecimal(object, from);
        }
        if (to.equals(BigInteger.class)) {
            return (T)toBigInteger(object, from);
        }

        return (T)object;
    }

    public static <T> T converter(Object object, Class<?> to) {
        Class<?> from = object.getClass();
        return converter(object, from, to);
    }

    private static String toStringA(Object object, Class<?> from) {

        if (referenceTypes.contains(from)) {
            return object.toString();
        }
        else if (from.equals(boolean.class) || from.equals(Boolean.class)) {
            return (boolean)object ? "1" : "0";
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
        if (from.equals(char.class) || from.equals(Character.class)) {
            return object.equals('1');
        }
        if (from.equals(short.class) || from.equals(Short.class)) {
            return object.equals((short)1);
        }
        if (from.equals(int.class) || from.equals(Integer.class)) {
            return object.equals(1);
        }
        if (from.equals(float.class) || from.equals(Float.class)) {
            return object.equals((float)1);
        }
        if (from.equals(byte.class) || from.equals(Byte.class)) {
            return object.equals((byte)1);
        }
        if (from.equals(double.class) || from.equals(Double.class)) {
            return object.equals(1.0);
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
        else if (from.equals(boolean.class) || from.equals(Boolean.class)) {
            return (byte) ((boolean) object ? 1 : 0);
        }
        if (from.equals(float.class) || from.equals(Float.class)) {
            return ((Float)object).byteValue();
        }
        if (from.equals(double.class) || from.equals(Double.class)) {
            return (byte)(double)object;
        }

        return Byte.valueOf(String.valueOf(object));
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
        else if (from.equals(boolean.class) || from.equals(Boolean.class)) {
            return (boolean)object ? '1' : '0';
        }
        if (from.equals(short.class) || from.equals(Short.class)) {
            return String.valueOf(object).charAt(0);
        }
        if (from.equals(int.class) || from.equals(Integer.class)) {
            return String.valueOf(object).charAt(0);
        }
        if (from.equals(float.class) || from.equals(Float.class)) {
            return String.valueOf(object).charAt(0);
        }
        if (from.equals(byte.class) || from.equals(Byte.class)) {
            return String.valueOf(object).charAt(0);
        }
        if (from.equals(double.class) || from.equals(Double.class)) {
            return String.valueOf(object).charAt(0);
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
        else if (from.equals(boolean.class) || from.equals(Boolean.class)) {
            return (boolean)object ? (short)1 : (short)0;
        }
        if (from.equals(char.class) || from.equals(Character.class)) {
            return Short.valueOf(String.valueOf(object));
        }
        if (from.equals(int.class) || from.equals(Integer.class)) {
            return Short.valueOf(String.valueOf(object));
        }
        if (from.equals(float.class) || from.equals(Float.class)) {
            return ((Float)object).shortValue();
        }
        if (from.equals(byte.class) || from.equals(Byte.class)) {
            return (short)(byte)object;
        }
        if (from.equals(double.class) || from.equals(Double.class)) {
            return (short)(double)object;
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
        else if (from.equals(boolean.class) || from.equals(Boolean.class)) {
            return (boolean)object ? 1 : 0;
        }
        if (from.equals(char.class) || from.equals(Character.class)) {
            return Integer.valueOf(String.valueOf(object));
        }
        if (from.equals(short.class) || from.equals(Short.class)) {
            return Integer.valueOf(String.valueOf(object));
        }
        if (from.equals(float.class) || from.equals(Float.class)) {
            return ((Float)object).intValue();
        }
        if (from.equals(byte.class) || from.equals(Byte.class)) {
            return (int)(byte)object;
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
        else if (from.equals(boolean.class) || from.equals(Boolean.class)) {
            return (boolean)object ? (float)1.0 : (float)0.0;
        }
        if (from.equals(char.class) || from.equals(Character.class)) {
            return Float.valueOf(String.valueOf(object));
        }
        if (from.equals(short.class) || from.equals(Short.class)) {
            return Float.valueOf(String.valueOf(object));
        }
        if (from.equals(int.class) || from.equals(Integer.class)) {
            return Float.valueOf(String.valueOf(object));
        }
        if (from.equals(byte.class) || from.equals(Byte.class)) {
            return (float)(byte)object;
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
        else if (from.equals(boolean.class) || from.equals(Boolean.class)) {
            return (boolean)object ? 1.0 : 0.0;
        }
        if (from.equals(char.class) || from.equals(Character.class)) {
            return Double.valueOf(String.valueOf(object));
        }
        if (from.equals(short.class) || from.equals(Short.class)) {
            return Double.valueOf(String.valueOf(object));
        }
        if (from.equals(int.class) || from.equals(Integer.class)) {
            return Double.valueOf(String.valueOf(object));
        }
        if (from.equals(float.class) || from.equals(Float.class)) {
            return ((Float)object).doubleValue();
        }
        if (from.equals(byte.class) || from.equals(Byte.class)) {
            return (double)(byte)object;
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
        else if (from.equals(boolean.class) || from.equals(Boolean.class)) {
            return (boolean)object ? (long)1 : 0;
        }
        if (from.equals(char.class) || from.equals(Character.class)) {
            return Long.valueOf(String.valueOf(object));
        }
        if (from.equals(short.class) || from.equals(Short.class)) {
            return Long.valueOf(String.valueOf(object));
        }
        if (from.equals(int.class) || from.equals(Integer.class)) {
            return Long.valueOf(String.valueOf(object));
        }
        if (from.equals(float.class) || from.equals(Float.class)) {
            return ((Float)object).longValue();
        }
        if (from.equals(byte.class) || from.equals(Byte.class)) {
            return (long)(byte)object;
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
            return new BigDecimal(toInt(object, from));
        }
        else if (from.equals(byte.class) || from.equals(Byte.class)) {
            return new BigDecimal((byte)object);
        }
        else if (from.equals(char.class) || from.equals(Character.class)) {
            return new BigDecimal(Long.parseLong(String.valueOf(object)));
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
        else if (from.equals(boolean.class) || from.equals(Boolean.class)) {
            return BigInteger.valueOf(toLong(object, from));
        }
        if (from.equals(char.class) || from.equals(Character.class)) {
            return BigInteger.valueOf(Long.parseLong(String.valueOf(object)));
        }
        if (from.equals(short.class) || from.equals(Short.class)) {
            return BigInteger.valueOf(Long.parseLong(String.valueOf(object)));
        }
        else if (from.equals(int.class) || from.equals(Integer.class)) {
            return BigInteger.valueOf(Long.parseLong(String.valueOf(object)));
        }
        else if (from.equals(float.class) || from.equals(Float.class)) {
            return BigInteger.valueOf(((Float)object).longValue());
        }
        if (from.equals(byte.class) || from.equals(Byte.class)) {
            return BigInteger.valueOf(Long.parseLong(String.valueOf(object)));
        }

        return BigInteger.valueOf((long)object);
    }
}
