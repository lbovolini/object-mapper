package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterBigDecimalTest {

    @Test
    void shouldConvertBigDecimalToBoolean() {
        boolean bool = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertBigDecimalToBooleanObject() {
        Boolean bool = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertBigDecimalToBooleanImplicit() {
        boolean bool = TypeConverter.converter(new BigDecimal(1), boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertBigDecimalToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter(new BigDecimal(1), Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertBigDecimalToChar() {
        char c = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBigDecimalToCharObject() {
        Character c = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBigDecimalToCharImplicit() {
        char c = TypeConverter.converter(new BigDecimal(1), char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBigDecimalToCharObjectImplicit() {
        Character c = TypeConverter.converter(new BigDecimal(1), Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBigDecimalToByte() {
        byte b = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBigDecimalToByteObject() {
        Byte b = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBigDecimalToByteImplicit() {
        byte b = TypeConverter.converter(new BigDecimal(1), byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBigDecimalToByteObjectImplicit() {
        Byte b = TypeConverter.converter(new BigDecimal(1), Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBigDecimalToShort() {
        short s = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBigDecimalToShortObject() {
        Short s = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBigDecimalToShortImplicit() {
        short s = TypeConverter.converter(new BigDecimal(1), short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBigDecimalToShortObjectImplicit() {
        Short s = TypeConverter.converter(new BigDecimal(1), Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBigDecimalToInt() {
        int i = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBigDecimalToIntObject() {
        Integer i = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBigDecimalToIntImplicit() {
        int i = TypeConverter.converter(new BigDecimal(1), int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBigDecimalToIntObjectImplicit() {
        Integer i = TypeConverter.converter(new BigDecimal(1), Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBigDecimalToFloat() {
        float f = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBigDecimalToFloatObject() {
        Float f = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBigDecimalToFloatImplicit() {
        float f = TypeConverter.converter(new BigDecimal(1), float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBigDecimalToFloatObjectImplicit() {
        Float f = TypeConverter.converter(new BigDecimal(1), Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBigDecimalToDouble() {
        double d = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBigDecimalToDoubleObject() {
        Double d = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBigDecimalToDoubleImplicit() {
        double d = TypeConverter.converter(new BigDecimal(1), double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBigDecimalToDoubleObjectImplicit() {
        Double d = TypeConverter.converter(new BigDecimal(1), Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBigDecimalToLong() {
        long l = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBigDecimalToLongObject() {
        Long l = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBigDecimalToLongImplicit() {
        long l = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBigDecimalToLongObjectImplicit() {
        Long l = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBigDecimalToString() {
        String s = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertBigDecimalToStringImplicit() {
        String s = TypeConverter.converter(new BigDecimal(1), String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertBigDecimalToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertBigDecimalToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter(new BigDecimal(1), BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertBigDecimalToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter(new BigDecimal(1), BigDecimal.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertBigDecimalToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter(new BigDecimal(1), BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

}