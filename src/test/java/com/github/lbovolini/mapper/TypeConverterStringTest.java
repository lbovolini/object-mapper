package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterStringTest {

    @Test
    void shouldConvertStringToBoolean() {
        boolean bool = TypeConverter.converter("1", String.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertStringToBooleanObject() {
        Boolean bool = TypeConverter.converter("1", String.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertStringToBooleanImplicit() {
        boolean bool = TypeConverter.converter("1", boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertStringToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter("1", Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertStringToChar() {
        char c = TypeConverter.converter("1", String.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertStringToCharObject() {
        Character c = TypeConverter.converter("1", String.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertStringToCharImplicit() {
        char c = TypeConverter.converter("1", char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertStringToCharObjectImplicit() {
        Character c = TypeConverter.converter("1", Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertStringToByte() {
        byte b = TypeConverter.converter("1", String.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertStringToByteObject() {
        Byte b = TypeConverter.converter("1", String.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertStringToByteImplicit() {
        byte b = TypeConverter.converter("1", byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertStringToByteObjectImplicit() {
        Byte b = TypeConverter.converter("1", Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertStringToShort() {
        short s = TypeConverter.converter("1", String.class, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertStringToShortObject() {
        Short s = TypeConverter.converter("1", String.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertStringToShortImplicit() {
        short s = TypeConverter.converter("1", short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertStringToShortObjectImplicit() {
        Short s = TypeConverter.converter("1", Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertStringToInt() {
        int i = TypeConverter.converter("1", String.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertStringToIntObject() {
        Integer i = TypeConverter.converter("1", String.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertStringToIntImplicit() {
        int i = TypeConverter.converter("1", int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertStringToIntObjectImplicit() {
        Integer i = TypeConverter.converter("1", Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertStringToFloat() {
        float f = TypeConverter.converter("1", String.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertStringToFloatObject() {
        Float f = TypeConverter.converter("1", String.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertStringToFloatImplicit() {
        float f = TypeConverter.converter("1", float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertStringToFloatObjectImplicit() {
        Float f = TypeConverter.converter("1", Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertStringToDouble() {
        double d = TypeConverter.converter("1", String.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertStringToDoubleObject() {
        Double d = TypeConverter.converter("1", String.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertStringToDoubleImplicit() {
        double d = TypeConverter.converter("1", double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertStringToDoubleObjectImplicit() {
        Double d = TypeConverter.converter("1", Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertStringToLong() {
        long l = TypeConverter.converter("1", String.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertStringToLongObject() {
        Long l = TypeConverter.converter("1", String.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertStringToLongImplicit() {
        long l = TypeConverter.converter("1", String.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertStringToLongObjectImplicit() {
        Long l = TypeConverter.converter("1", String.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertStringToString() {
        String s = TypeConverter.converter("1", String.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertStringToStringImplicit() {
        String s = TypeConverter.converter("1", String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertStringToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter("1", String.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertStringToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter("1", BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertStringToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter("1", String.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertStringToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter("1", BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

}