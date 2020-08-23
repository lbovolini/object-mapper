package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterFloatTest {

    @Test
    void shouldConvertFloatToBoolean() {
        boolean bool = TypeConverter.converter((float)1, float.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertFloatObjectToBoolean() {
        boolean bool = TypeConverter.converter((float)1, Float.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertFloatToBooleanObject() {
        Boolean bool = TypeConverter.converter((float)1, float.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertFloatObjectToBooleanObject() {
        Boolean bool = TypeConverter.converter((float)1, Float.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertFloatToBooleanImplicit() {
        boolean bool = TypeConverter.converter((float)1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertFloatObjectToBooleanImplicit() {
        boolean bool = TypeConverter.converter((float)1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertFloatToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter((float)1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertFloatObjectToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter((float)1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertFloatToChar() {
        char c = TypeConverter.converter((float)1, float.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertFloatObjectToChar() {
        char c = TypeConverter.converter((float)1, Float.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertFloatToCharObject() {
        Character c = TypeConverter.converter((float)1, float.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertFloatObjectToCharObject() {
        Character c = TypeConverter.converter((float)1, Float.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertFloatToCharImplicit() {
        char c = TypeConverter.converter((float)1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertFloatObjectToCharImplicit() {
        char c = TypeConverter.converter((float)1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertFloatToCharObjectImplicit() {
        Character c = TypeConverter.converter((float)1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertFloatObjectToCharObjectImplicit() {
        Character c = TypeConverter.converter((float)1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertFloatToByte() {
        byte b = TypeConverter.converter((float)1, float.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertFloatObjectToByte() {
        byte b = TypeConverter.converter((float)1, Float.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertFloatToByteObject() {
        Byte b = TypeConverter.converter((float)1, float.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertFloatObjectToByteObject() {
        Byte b = TypeConverter.converter((float)1, Float.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertFloatToByteImplicit() {
        byte b = TypeConverter.converter((float)1, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertFloatObjectToByteImplicit() {
        byte b = TypeConverter.converter((float)1, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertFloatToByteObjectImplicit() {
        Byte b = TypeConverter.converter((float)1, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertFloatObjectToByteObjectImplicit() {
        Byte b = TypeConverter.converter((float)1, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertFloatToShort() {
        short s = TypeConverter.converter((float)1, float.class, short.class);
        assertEquals(1, s);
    }

    @Test
    void shouldConvertFloatObjectToShort() {
        short s = TypeConverter.converter((float)1, Float.class, short.class);
        assertEquals(1, s);
    }

    @Test
    void shouldConvertFloatToShortObject() {
        Short s = TypeConverter.converter((float)1, float.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertObjectFloatToShortObject() {
        Short s = TypeConverter.converter((float)1, Float.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertFloatToShortImplicit() {
        short s = TypeConverter.converter((float)1, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertFloatObjectToShortImplicit() {
        short s = TypeConverter.converter((float)1, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertFloatToShortObjectImplicit() {
        Short s = TypeConverter.converter((float)1, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertFloatObjectToShortObjectImplicit() {
        Short s = TypeConverter.converter((float)1, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertFloatToInt() {
        int i = TypeConverter.converter((float)1, float.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertFloatObjectToInt() {
        int i = TypeConverter.converter((float)1, Float.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertFloatToIntObject() {
        Integer i = TypeConverter.converter((float)1, float.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertFloatObjectToIntObject() {
        Integer i = TypeConverter.converter((float)1, Float.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertFloatToIntImplicit() {
        int i = TypeConverter.converter((float)1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertFloatObjectToIntImplicit() {
        int i = TypeConverter.converter((float)1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertFloatToIntObjectImplicit() {
        Integer i = TypeConverter.converter((float)1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertFloatObjectToIntObjectImplicit() {
        Integer i = TypeConverter.converter((float)1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertFloatToFloat() {
        float f = TypeConverter.converter((float)1, float.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertFloatObjectToFloat() {
        float f = TypeConverter.converter((float)1, Float.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertFloatToFloatObject() {
        Float f = TypeConverter.converter((float)1, float.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertFloatObjectToFloatObject() {
        Float f = TypeConverter.converter((float)1, Float.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertFloatToFloatImplicit() {
        float f = TypeConverter.converter((float)1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertFloatObjectToFloatImplicit() {
        float f = TypeConverter.converter((float)1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertFloatToFloatObjectImplicit() {
        Float f = TypeConverter.converter((float)1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertFloatObjectToFloatObjectImplicit() {
        Float f = TypeConverter.converter((float)1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertFloatToDouble() {
        double d = TypeConverter.converter((float)1, float.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertFloatObjectToDouble() {
        double d = TypeConverter.converter((float)1, Float.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertFloatToDoubleObject() {
        Double d = TypeConverter.converter((float)1, float.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertFloatObjectToDoubleObject() {
        Double d = TypeConverter.converter((float)1, Float.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertFloatToDoubleImplicit() {
        double d = TypeConverter.converter((float)1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertFloatObjectToDoubleImplicit() {
        double d = TypeConverter.converter((float)1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertFloatToDoubleObjectImplicit() {
        Double d = TypeConverter.converter((float)1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertFloatObjectToDoubleObjectImplicit() {
        Double d = TypeConverter.converter((float)1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertFloatToLong() {
        long l = TypeConverter.converter((float)1, float.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertFloatObjectToLong() {
        long l = TypeConverter.converter((float)1, Float.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertFloatToLongObject() {
        Long l = TypeConverter.converter((float)1, float.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertFloatObjectToLongObject() {
        Long l = TypeConverter.converter((float)1, Float.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertFloatToLongImplicit() {
        long l = TypeConverter.converter((float)1, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertFloatObjectToLongImplicit() {
        long l = TypeConverter.converter((float)1, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertFloatToLongObjectImplicit() {
        Long l = TypeConverter.converter((float)1, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertFloatObjectToLongObjectImplicit() {
        Long l = TypeConverter.converter((float)1, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertFloatToString() {
        String s = TypeConverter.converter((float)1, int.class, String.class);
        assertEquals("1.0", s);
    }

    @Test
    void shouldConvertFloatObjectToString() {
        String s = TypeConverter.converter((float)1, Float.class, String.class);
        assertEquals("1.0", s);
    }

    @Test
    void shouldConvertFloatToStringImplicit() {
        String s = TypeConverter.converter((float)1, String.class);
        assertEquals("1.0", s);
    }

    @Test
    void shouldConvertFloatObjectToStringImplicit() {
        String s = TypeConverter.converter((float)1, String.class);
        assertEquals("1.0", s);
    }

    @Test
    void shouldConvertFloatToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter((float)1, float.class, BigDecimal.class);
        assertEquals(new BigDecimal("1.0"), bigDecimal);
    }

    @Test
    void shouldConvertFloatObjectToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter((float)1, Float.class, BigDecimal.class);
        assertEquals(new BigDecimal("1.0"), bigDecimal);
    }

    @Test
    void shouldConvertFloatToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter((float)1, BigDecimal.class);
        assertEquals(new BigDecimal("1.0"), bigDecimal);
    }

    @Test
    void shouldConvertFloatObjectToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter((float)1, BigDecimal.class);
        assertEquals(new BigDecimal("1.0"), bigDecimal);
    }

    @Test
    void shouldConvertFloatToBigInteger() {
        BigInteger bigFloat = TypeConverter.converter((float)1, float.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigFloat);
    }

    @Test
    void shouldConvertFloatObjectToBigInteger() {
        BigInteger bigFloat = TypeConverter.converter((float)1, Float.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigFloat);
    }

    @Test
    void shouldConvertFloatToBigIntegerImplicit() {
        BigInteger bigFloat = TypeConverter.converter((float)1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigFloat);
    }

    @Test
    void shouldConvertFloatObjectToBigIntegerImplicit() {
        BigInteger bigFloat = TypeConverter.converter((float)1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigFloat);
    }
}