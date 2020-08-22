package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterShortTest {

    @Test
    void shouldConvertShortToBoolean() {
        boolean bool = TypeConverter.converter((short)1, short.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertShortObjectToBoolean() {
        boolean bool = TypeConverter.converter((short)1, Short.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertShortToBooleanObject() {
        Boolean bool = TypeConverter.converter((short)1, short.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertShortObjectToBooleanObject() {
        Boolean bool = TypeConverter.converter((short)1, Short.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertShortToBooleanImplicit() {
        boolean bool = TypeConverter.converter((short)1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertShortObjectToBooleanImplicit() {
        boolean bool = TypeConverter.converter((short)1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertShortToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter((short)1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertShortObjectToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter((short)1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertShortToChar() {
        char c = TypeConverter.converter((short)1, short.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertShorObjecttToChar() {
        char c = TypeConverter.converter((short)1, Short.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertShortToCharObject() {
        Character c = TypeConverter.converter((short)1, short.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertShortObjectToCharObject() {
        Character c = TypeConverter.converter((short)1, Short.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertShortToCharImplicit() {
        char c = TypeConverter.converter((short)1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertShorObjecttToCharImplicit() {
        char c = TypeConverter.converter((short)1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertShortToCharObjectImplicit() {
        Character c = TypeConverter.converter((short)1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertShortObjectToCharObjectImplicit() {
        Character c = TypeConverter.converter((short)1, Character.class);
        assertEquals('1', c);
    }




    @Test
    void shouldConvertShortToByte() {
        byte b = TypeConverter.converter((short)1, short.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertShortObjectToByte() {
        byte b = TypeConverter.converter((short)1, Short.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertShortToByteObject() {
        Byte b = TypeConverter.converter((short)1, short.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertShortObjectToByteObject() {
        Byte b = TypeConverter.converter((short)1, Short.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertShortToByteImplicit() {
        byte b = TypeConverter.converter((short)1, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertShortObjectToByteImplicit() {
        byte b = TypeConverter.converter((short)1, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertShortToByteObjectImplicit() {
        Byte b = TypeConverter.converter((short)1, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertShortObjectToByteObjectImplicit() {
        Byte b = TypeConverter.converter((short)1, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertShortToShort() {
        short s = TypeConverter.converter((short)1, short.class, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertShortObjectToShort() {
        short s = TypeConverter.converter((short)1, Short.class, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertShortToShortObject() {
        Short s = TypeConverter.converter((short)1, short.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertObjectShortToShortObject() {
        Short s = TypeConverter.converter((short)1, Short.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertShortToShortImplicit() {
        short s = TypeConverter.converter((short)1, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertShortObjectToShortImplicit() {
        short s = TypeConverter.converter((short)1, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertShortToShortObjectImplicit() {
        Short s = TypeConverter.converter((short)1, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertShortObjectToShortObjectImplicit() {
        Short s = TypeConverter.converter((short)1, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertShortToInt() {
        int i = TypeConverter.converter((short)1, short.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertShortObjectToInt() {
        int i = TypeConverter.converter((short)1, Short.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertShortToIntObject() {
        Integer i = TypeConverter.converter((short)1, short.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertShortObjectToIntObject() {
        Integer i = TypeConverter.converter((short)1, Short.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertShortToIntImplicit() {
        int i = TypeConverter.converter((short)1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertShortObjectToIntImplicit() {
        int i = TypeConverter.converter((short)1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertShortToIntObjectImplicit() {
        Integer i = TypeConverter.converter((short)1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertShortObjectToIntObjectImplicit() {
        Integer i = TypeConverter.converter((short)1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertShortToFloat() {
        float f = TypeConverter.converter((short)1, short.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertShortObjectToFloat() {
        float f = TypeConverter.converter((short)1, Short.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertShortToFloatObject() {
        Float f = TypeConverter.converter((short)1, short.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertShortObjectToFloatObject() {
        Float f = TypeConverter.converter((short)1, Short.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertShortToFloatImplicit() {
        float f = TypeConverter.converter((short)1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertShortObjectToFloatImplicit() {
        float f = TypeConverter.converter((short)1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertShortToFloatObjectImplicit() {
        Float f = TypeConverter.converter((short)1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertShortObjectToFloatObjectImplicit() {
        Float f = TypeConverter.converter((short)1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertShortToDouble() {
        double d = TypeConverter.converter((short)1, short.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertShortObjectToDouble() {
        double d = TypeConverter.converter((short)1, Short.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertShortToDoubleObject() {
        Double d = TypeConverter.converter((short)1, short.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertShortObjectToDoubleObject() {
        Double d = TypeConverter.converter((short)1, Short.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertShortToDoubleImplicit() {
        double d = TypeConverter.converter((short)1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertShortObjectToDoubleImplicit() {
        double d = TypeConverter.converter((short)1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertShortToDoubleObjectImplicit() {
        Double d = TypeConverter.converter((short)1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertShortObjectToDoubleObjectImplicit() {
        Double d = TypeConverter.converter((short)1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertShortToLong() {
        long l = TypeConverter.converter((short)1, short.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertShortObjectToLong() {
        long l = TypeConverter.converter((short)1, Short.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertShortToLongObject() {
        Long l = TypeConverter.converter((short)1, short.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertShortObjectToLongObject() {
        Long l = TypeConverter.converter((short)1, Short.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertShortToLongImplicit() {
        long l = TypeConverter.converter((short)1, short.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertShortObjectToLongImplicit() {
        long l = TypeConverter.converter((short)1, Short.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertShortToLongObjectImplicit() {
        Long l = TypeConverter.converter((short)1, short.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertShortObjectToLongObjectImplicit() {
        Long l = TypeConverter.converter((short)1, Short.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shoulConvertShortToString() {
        String s = TypeConverter.converter((short)1, short.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shoulConvertShortObjectToString() {
        String s = TypeConverter.converter((short)1, Short.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shoulConvertShortToStringImplicit() {
        String s = TypeConverter.converter((short)1, String.class);
        assertEquals("1", s);
    }

    @Test
    void shoulConvertShortObjectToStringImplicit() {
        String s = TypeConverter.converter((short)1, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertShortToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter((short)1, short.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertShortObjectToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter((short)1, Short.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertShortToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter((short)1, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertShortObjectToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter((short)1, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertShortToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter((short)1, short.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertShortObjectToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter((short)1, Short.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertShortToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter((short)1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertShortObjectToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter((short)1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }
}