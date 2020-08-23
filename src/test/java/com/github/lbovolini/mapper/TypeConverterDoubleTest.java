package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterDoubleTest {

    @Test
    void shouldConvertDoubleToBoolean() {
        boolean bool = TypeConverter.converter((double)1, double.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertDoubleObjectToBoolean() {
        boolean bool = TypeConverter.converter((double)1, Double.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertDoubleToBooleanObject() {
        Boolean bool = TypeConverter.converter((double)1, double.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertDoubleObjectToBooleanObject() {
        Boolean bool = TypeConverter.converter((double)1, Double.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertDoubleToBooleanImplicit() {
        boolean bool = TypeConverter.converter((double)1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertDoubleObjectToBooleanImplicit() {
        boolean bool = TypeConverter.converter((double)1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertDoubleToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter((double)1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertDoubleObjectToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter((double)1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertDoubleToChar() {
        char c = TypeConverter.converter((double)1, double.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertDoubleObjectToChar() {
        char c = TypeConverter.converter((double)1, Double.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertDoubleToCharObject() {
        Character c = TypeConverter.converter((double)1, double.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertDoubleObjectToCharObject() {
        Character c = TypeConverter.converter((double)1, Double.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertDoubleToCharImplicit() {
        char c = TypeConverter.converter((double)1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertDoubleObjectToCharImplicit() {
        char c = TypeConverter.converter((double)1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertDoubleToCharObjectImplicit() {
        Character c = TypeConverter.converter((double)1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertDoubleObjectToCharObjectImplicit() {
        Character c = TypeConverter.converter((double)1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertDoubleToByte() {
        byte b = TypeConverter.converter((double)1, double.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertDoubleObjectToByte() {
        byte b = TypeConverter.converter((double)1, Double.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertDoubleToByteObject() {
        Byte b = TypeConverter.converter((double)1, double.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertDoubleObjectToByteObject() {
        Byte b = TypeConverter.converter((double)1, Double.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertDoubleToByteImplicit() {
        byte b = TypeConverter.converter((double)1, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertDoubleObjectToByteImplicit() {
        byte b = TypeConverter.converter((double)1, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertDoubleToByteObjectImplicit() {
        Byte b = TypeConverter.converter((double)1, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertDoubleObjectToByteObjectImplicit() {
        Byte b = TypeConverter.converter((double)1, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertDoubleToShort() {
        short s = TypeConverter.converter((double)1, double.class, short.class);
        assertEquals(1, s);
    }

    @Test
    void shouldConvertDoubleObjectToShort() {
        short s = TypeConverter.converter((double)1, Double.class, short.class);
        assertEquals(1, s);
    }

    @Test
    void shouldConvertDoubleToShortObject() {
        Short s = TypeConverter.converter((double)1, double.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertObjectFloatToShortObject() {
        Short s = TypeConverter.converter((double)1, Double.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertDoubleToShortImplicit() {
        short s = TypeConverter.converter((double)1, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertDoubleObjectToShortImplicit() {
        short s = TypeConverter.converter((double)1, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertDoubleToShortObjectImplicit() {
        Short s = TypeConverter.converter((double)1, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertDoubleObjectToShortObjectImplicit() {
        Short s = TypeConverter.converter((double)1, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertDoubleToInt() {
        int i = TypeConverter.converter((double)1, double.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertDoubleObjectToInt() {
        int i = TypeConverter.converter((double)1, Double.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertDoubleToIntObject() {
        Integer i = TypeConverter.converter((double)1, double.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertDoubleObjectToIntObject() {
        Integer i = TypeConverter.converter((double)1, Double.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertDoubleToIntImplicit() {
        int i = TypeConverter.converter((double)1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertDoubleObjectToIntImplicit() {
        int i = TypeConverter.converter((double)1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertDoubleToIntObjectImplicit() {
        Integer i = TypeConverter.converter((double)1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertDoubleObjectToIntObjectImplicit() {
        Integer i = TypeConverter.converter((double)1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertDoubleToFloat() {
        float f = TypeConverter.converter((double)1, double.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertDoubleObjectToFloat() {
        float f = TypeConverter.converter((double)1, Double.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertDoubleToFloatObject() {
        Float f = TypeConverter.converter((double)1, double.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertDoubleObjectToFloatObject() {
        Float f = TypeConverter.converter((double)1, Double.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertDoubleToFloatImplicit() {
        float f = TypeConverter.converter((double)1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertDoubleObjectToFloatImplicit() {
        float f = TypeConverter.converter((double)1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertDoubleToFloatObjectImplicit() {
        Float f = TypeConverter.converter((double)1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertDoubleObjectToFloatObjectImplicit() {
        Float f = TypeConverter.converter((double)1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertDoubleToDouble() {
        double d = TypeConverter.converter((double)1, double.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertDoubleObjectToDouble() {
        double d = TypeConverter.converter((double)1, Double.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertDoubleToDoubleObject() {
        Double d = TypeConverter.converter((double)1, double.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertDoubleObjectToDoubleObject() {
        Double d = TypeConverter.converter((double)1, Double.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertDoubleToDoubleImplicit() {
        double d = TypeConverter.converter((double)1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertDoubleObjectToDoubleImplicit() {
        double d = TypeConverter.converter((double)1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertDoubleToDoubleObjectImplicit() {
        Double d = TypeConverter.converter((double)1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertDoubleObjectToDoubleObjectImplicit() {
        Double d = TypeConverter.converter((double)1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertDoubleToLong() {
        long l = TypeConverter.converter((double)1, double.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertDoubleObjectToLong() {
        long l = TypeConverter.converter((double)1, Double.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertDoubleToLongObject() {
        Long l = TypeConverter.converter((double)1, double.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertDoubleObjectToLongObject() {
        Long l = TypeConverter.converter((double)1, Double.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertDoubleToLongImplicit() {
        long l = TypeConverter.converter((double)1, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertDoubleObjectToLongImplicit() {
        long l = TypeConverter.converter((double)1, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertDoubleToLongObjectImplicit() {
        Long l = TypeConverter.converter((double)1, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertDoubleObjectToLongObjectImplicit() {
        Long l = TypeConverter.converter((double)1, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertDoubleToString() {
        String s = TypeConverter.converter((double)1, int.class, String.class);
        assertEquals("1.0", s);
    }

    @Test
    void shouldConvertDoubleObjectToString() {
        String s = TypeConverter.converter((double)1, Double.class, String.class);
        assertEquals("1.0", s);
    }

    @Test
    void shouldConvertDoubleToStringImplicit() {
        String s = TypeConverter.converter((double)1, String.class);
        assertEquals("1.0", s);
    }

    @Test
    void shouldConvertDoubleObjectToStringImplicit() {
        String s = TypeConverter.converter((double)1, String.class);
        assertEquals("1.0", s);
    }

    @Test
    void shouldConvertDoubleToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter((double)1, double.class, BigDecimal.class);
        assertEquals(new BigDecimal("1.0"), bigDecimal);
    }

    @Test
    void shouldConvertDoubleObjectToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter((double)1, Double.class, BigDecimal.class);
        assertEquals(new BigDecimal("1.0"), bigDecimal);
    }

    @Test
    void shouldConvertDoubleToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter((double)1, BigDecimal.class);
        assertEquals(new BigDecimal("1.0"), bigDecimal);
    }

    @Test
    void shouldConvertDoubleObjectToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter((double)1, BigDecimal.class);
        assertEquals(new BigDecimal("1.0"), bigDecimal);
    }

    @Test
    void shouldConvertDoubleToBigInteger() {
        BigInteger bigFloat = TypeConverter.converter((double)1, double.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigFloat);
    }

    @Test
    void shouldConvertDoubleObjectToBigInteger() {
        BigInteger bigFloat = TypeConverter.converter((double)1, Double.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigFloat);
    }

    @Test
    void shouldConvertDoubleToBigIntegerImplicit() {
        BigInteger bigFloat = TypeConverter.converter((double)1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigFloat);
    }

    @Test
    void shouldConvertDoubleObjectToBigIntegerImplicit() {
        BigInteger bigFloat = TypeConverter.converter((double)1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigFloat);
    }
}