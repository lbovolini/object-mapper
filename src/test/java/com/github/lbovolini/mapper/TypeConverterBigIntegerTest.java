package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterBigIntegerTest {

    @Test
    void shouldConvertBigIntegerToBoolean() {
        boolean bool = TypeConverter.converter(BigInteger.ONE, BigInteger.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertBigIntegerToBooleanObject() {
        Boolean bool = TypeConverter.converter(BigInteger.ONE, BigInteger.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertBigIntegerToBooleanImplicit() {
        boolean bool = TypeConverter.converter(BigInteger.ONE, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertBigIntegerToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter(BigInteger.ONE, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertBigIntegerToChar() {
        char c = TypeConverter.converter(BigInteger.ONE, BigInteger.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBigIntegerToCharObject() {
        Character c = TypeConverter.converter(BigInteger.ONE, BigInteger.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBigIntegerToCharImplicit() {
        char c = TypeConverter.converter(BigInteger.ONE, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBigIntegerToCharObjectImplicit() {
        Character c = TypeConverter.converter(BigInteger.ONE, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBigIntegerToByte() {
        byte b = TypeConverter.converter(BigInteger.ONE, BigInteger.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBigIntegerToByteObject() {
        Byte b = TypeConverter.converter(BigInteger.ONE, BigInteger.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBigIntegerToByteImplicit() {
        byte b = TypeConverter.converter(BigInteger.ONE, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBigIntegerToByteObjectImplicit() {
        Byte b = TypeConverter.converter(BigInteger.ONE, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBigIntegerToShort() {
        short s = TypeConverter.converter(BigInteger.ONE, BigInteger.class, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBigIntegerToShortObject() {
        Short s = TypeConverter.converter(BigInteger.ONE, BigInteger.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBigIntegerToShortImplicit() {
        short s = TypeConverter.converter(BigInteger.ONE, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBigIntegerToShortObjectImplicit() {
        Short s = TypeConverter.converter(BigInteger.ONE, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBigIntegerToInt() {
        int i = TypeConverter.converter(BigInteger.ONE, BigInteger.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBigIntegerToIntObject() {
        Integer i = TypeConverter.converter(BigInteger.ONE, BigInteger.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBigIntegerToIntImplicit() {
        int i = TypeConverter.converter(BigInteger.ONE, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBigIntegerToIntObjectImplicit() {
        Integer i = TypeConverter.converter(BigInteger.ONE, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBigIntegerToFloat() {
        float f = TypeConverter.converter(BigInteger.ONE, BigInteger.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBigIntegerToFloatObject() {
        Float f = TypeConverter.converter(BigInteger.ONE, BigInteger.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBigIntegerToFloatImplicit() {
        float f = TypeConverter.converter(BigInteger.ONE, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBigIntegerToFloatObjectImplicit() {
        Float f = TypeConverter.converter(BigInteger.ONE, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBigIntegerToDouble() {
        double d = TypeConverter.converter(BigInteger.ONE, BigInteger.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBigIntegerToDoubleObject() {
        Double d = TypeConverter.converter(BigInteger.ONE, BigInteger.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBigIntegerToDoubleImplicit() {
        double d = TypeConverter.converter(BigInteger.ONE, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBigIntegerToDoubleObjectImplicit() {
        Double d = TypeConverter.converter(BigInteger.ONE, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBigIntegerToLong() {
        long l = TypeConverter.converter(BigInteger.ONE, BigInteger.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBigIntegerToLongObject() {
        Long l = TypeConverter.converter(BigInteger.ONE, BigInteger.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBigIntegerToLongImplicit() {
        long l = TypeConverter.converter(BigInteger.ONE, BigInteger.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBigIntegerToLongObjectImplicit() {
        Long l = TypeConverter.converter(BigInteger.ONE, BigInteger.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBigIntegerToString() {
        String s = TypeConverter.converter(BigInteger.ONE, BigInteger.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertBigIntegerToStringImplicit() {
        String s = TypeConverter.converter(BigInteger.ONE, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertBigIntegerToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter(BigInteger.ONE, BigInteger.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertBigIntegerToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter(BigInteger.ONE, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertBigIntegerToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter(BigInteger.ONE, BigInteger.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertBigIntegerToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter(BigInteger.ONE, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

}