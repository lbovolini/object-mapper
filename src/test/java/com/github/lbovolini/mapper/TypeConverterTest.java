package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterTest {

    @Test
    void shouldConvertBooleanToByte() {
        byte b = TypeConverter.converter(true, boolean.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBooleanObjectToByte() {
        byte b = TypeConverter.converter(Boolean.TRUE, Boolean.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBooleanToByteObject() {
        Byte b = TypeConverter.converter(true, boolean.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBooleanObjectToByteObject() {
        Byte b = TypeConverter.converter(Boolean.TRUE, Boolean.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBooleanToByteImplicit() {
        byte b = TypeConverter.converter(true, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBooleanObjectToByteImplicit() {
        byte b = TypeConverter.converter(Boolean.TRUE, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBooleanToByteObjectImplicit() {
        Byte b = TypeConverter.converter(true, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBooleanObjectToByteObjectImplicit() {
        Byte b = TypeConverter.converter(Boolean.TRUE, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertBooleanToChar() {
        char c = TypeConverter.converter(true, boolean.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBooleanObjectToChar() {
        char c = TypeConverter.converter(Boolean.TRUE, Boolean.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBooleanToCharObject() {
        Character c = TypeConverter.converter(true, boolean.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBooleanObjectToCharObject() {
        Character c = TypeConverter.converter(Boolean.TRUE, Boolean.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBooleanToCharImplicit() {
        char c = TypeConverter.converter(true, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBooleanObjectToCharImplicit() {
        char c = TypeConverter.converter(Boolean.TRUE, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBooleanToCharObjectImplicit() {
        Character c = TypeConverter.converter(true, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBooleanObjectToCharObjectImplicit() {
        Character c = TypeConverter.converter(Boolean.TRUE, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertBooleanToShort() {
        short s = TypeConverter.converter(true, boolean.class, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBooleanObjectToShort() {
        short s = TypeConverter.converter(Boolean.TRUE, Boolean.class, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBooleanToShortObject() {
        Short s = TypeConverter.converter(true, boolean.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBooleanObjectToShortObject() {
        Short s = TypeConverter.converter(Boolean.TRUE, Boolean.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBooleanToShortImplicit() {
        short s = TypeConverter.converter(true, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBooleanObjectToShortImplicit() {
        short s = TypeConverter.converter(Boolean.TRUE, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBooleanToShortObjectImplicit() {
        Short s = TypeConverter.converter(true, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBooleanObjectToShortObjectImplicit() {
        Short s = TypeConverter.converter(Boolean.TRUE, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertBooleanToInt() {
        int i = TypeConverter.converter(true, boolean.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBooleanObjectToInt() {
        int i = TypeConverter.converter(Boolean.TRUE, Boolean.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBooleanToIntObject() {
        Integer i = TypeConverter.converter(true, boolean.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBooleanObjectToIntObject() {
        Integer i = TypeConverter.converter(Boolean.TRUE, Boolean.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBooleanToIntImplicit() {
        int i = TypeConverter.converter(true, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBooleanObjectToIntImplicit() {
        int i = TypeConverter.converter(Boolean.TRUE, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBooleanToIntObjectImplicit() {
        Integer i = TypeConverter.converter(true, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBooleanObjectToIntObjectImplicit() {
        Integer i = TypeConverter.converter(Boolean.TRUE, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertBooleanToFloat() {
        float f = TypeConverter.converter(true, boolean.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBooleanObjectToFloat() {
        float f = TypeConverter.converter(Boolean.TRUE, Boolean.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBooleanToFloatObject() {
        Float f = TypeConverter.converter(true, boolean.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBooleanObjectToFloatObject() {
        Float f = TypeConverter.converter(Boolean.TRUE, Boolean.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBooleanToFloatImplicit() {
        float f = TypeConverter.converter(true, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBooleanObjectToFloatImplicit() {
        float f = TypeConverter.converter(Boolean.TRUE, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBooleanToFloatObjectImplicit() {
        Float f = TypeConverter.converter(true, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBooleanObjectToFloatObjectImplicit() {
        Float f = TypeConverter.converter(Boolean.TRUE, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertBooleanToDouble() {
        double d = TypeConverter.converter(true, boolean.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBooleanObjectToDouble() {
        double d = TypeConverter.converter(Boolean.TRUE, Boolean.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBooleanToDoubleObject() {
        Double d = TypeConverter.converter(true, boolean.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBooleanObjectToDoubleObject() {
        Double d = TypeConverter.converter(Boolean.TRUE, Boolean.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBooleanToDoubleImplicit() {
        double d = TypeConverter.converter(true, boolean.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBooleanObjectToDoubleImplicit() {
        double d = TypeConverter.converter(Boolean.TRUE, Boolean.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBooleanToDoubleObjectImplicit() {
        Double d = TypeConverter.converter(true, boolean.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBooleanObjectToDoubleObjectImplicit() {
        Double d = TypeConverter.converter(Boolean.TRUE, Boolean.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertBooleanToLong() {
        long l = TypeConverter.converter(true, boolean.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBooleanObjectToLong() {
        long l = TypeConverter.converter(Boolean.TRUE, Boolean.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBooleanToLongObject() {
        Long l = TypeConverter.converter(true, boolean.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBooleanObjectToLongObject() {
        Long l = TypeConverter.converter(Boolean.TRUE, Boolean.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBooleanToLongImplicit() {
        long l = TypeConverter.converter(true, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBooleanObjectToLongImplicit() {
        long l = TypeConverter.converter(Boolean.TRUE, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBooleanToLongObjectImplicit() {
        Long l = TypeConverter.converter(true, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBooleanObjectToLongObjectImplicit() {
        Long l = TypeConverter.converter(Boolean.TRUE, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertBooleanToString() {
        String s = TypeConverter.converter(true, boolean.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertBooleanObjectToString() {
        String s = TypeConverter.converter(true, Boolean.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertBooleanToStringImplicit() {
        String s = TypeConverter.converter(true, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertBooleanObjectToStringImplicit() {
        String s = TypeConverter.converter(true, String.class);
        assertEquals("1", s);
    }
}