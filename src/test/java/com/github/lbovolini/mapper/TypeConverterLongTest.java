package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterLongTest {

    @Test
    void shouldConvertLongToBoolean() {
        boolean bool = TypeConverter.converter((long)1, long.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertLongObjectToBoolean() {
        boolean bool = TypeConverter.converter((long)1, Long.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertLongToBooleanObject() {
        Boolean bool = TypeConverter.converter((long)1, long.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertLongObjectToBooleanObject() {
        Boolean bool = TypeConverter.converter((long)1, Long.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertLongToBooleanImplicit() {
        boolean bool = TypeConverter.converter((long)1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertLongObjectToBooleanImplicit() {
        boolean bool = TypeConverter.converter((long)1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertLongToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter((long)1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertLongObjectToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter((long)1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertLongToChar() {
        char c = TypeConverter.converter((long)1, long.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertLongObjectToChar() {
        char c = TypeConverter.converter((long)1, Long.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertLongToCharObject() {
        Character c = TypeConverter.converter((long)1, long.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertLongObjectToCharObject() {
        Character c = TypeConverter.converter((long)1, Long.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertLongToCharImplicit() {
        char c = TypeConverter.converter((long)1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertLongObjectToCharImplicit() {
        char c = TypeConverter.converter((long)1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertLongToCharObjectImplicit() {
        Character c = TypeConverter.converter((long)1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertLongObjectToCharObjectImplicit() {
        Character c = TypeConverter.converter((long)1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertLongToByte() {
        byte b = TypeConverter.converter((long)1, long.class, byte.class);
        assertEquals((byte)(long)1, b);
    }

    @Test
    void shouldConvertLongObjectToByte() {
        byte b = TypeConverter.converter((long)1, Long.class, byte.class);
        assertEquals((byte)(long)1, b);
    }

    @Test
    void shouldConvertLongToByteObject() {
        Byte b = TypeConverter.converter((long)1, long.class, Byte.class);
        assertEquals((byte)(long)1, b);
    }

    @Test
    void shouldConvertLongObjectToByteObject() {
        Byte b = TypeConverter.converter((long)1, Long.class, Byte.class);
        assertEquals((byte)(long)1, b);
    }

    @Test
    void shouldConvertLongToByteImplicit() {
        byte b = TypeConverter.converter((long)1, byte.class);
        assertEquals((byte)(long)1, b);
    }

    @Test
    void shouldConvertLongObjectToByteImplicit() {
        byte b = TypeConverter.converter((long)1, byte.class);
        assertEquals((byte)(long)1, b);
    }

    @Test
    void shouldConvertLongToByteObjectImplicit() {
        Byte b = TypeConverter.converter((long)1, Byte.class);
        assertEquals((byte)(long)1, b);
    }

    @Test
    void shouldConvertLongObjectToByteObjectImplicit() {
        Byte b = TypeConverter.converter((long)1, Byte.class);
        assertEquals((byte)(long)1, b);
    }

    @Test
    void shouldConvertLongToShort() {
        short s = TypeConverter.converter((long)1, long.class, short.class);
        assertEquals((long)1, s);
    }

    @Test
    void shouldConvertLongObjectToShort() {
        short s = TypeConverter.converter((long)1, Long.class, short.class);
        assertEquals((long)1, s);
    }

    @Test
    void shouldConvertLongToShortObject() {
        Short s = TypeConverter.converter((long)1, long.class, Short.class);
        assertEquals((short)(long)1, s);
    }

    @Test
    void shouldConvertObjectIntToShortObject() {
        Short s = TypeConverter.converter((long)1, Long.class, Short.class);
        assertEquals((short)(long)1, s);
    }

    @Test
    void shouldConvertLongToShortImplicit() {
        short s = TypeConverter.converter((long)1, short.class);
        assertEquals((short)(long)1, s);
    }

    @Test
    void shouldConvertLongObjectToShortImplicit() {
        short s = TypeConverter.converter((long)1, short.class);
        assertEquals((short)(long)1, s);
    }

    @Test
    void shouldConvertLongToShortObjectImplicit() {
        Short s = TypeConverter.converter((long)1, Short.class);
        assertEquals((short)(long)1, s);
    }

    @Test
    void shouldConvertLongObjectToShortObjectImplicit() {
        Short s = TypeConverter.converter((long)1, Short.class);
        assertEquals((short)(long)1, s);
    }

    @Test
    void shouldConvertLongToInt() {
        int i = TypeConverter.converter((long)1, long.class, int.class);
        assertEquals((long)1, i);
    }

    @Test
    void shouldConvertLongObjectToInt() {
        int i = TypeConverter.converter((long)1, Long.class, int.class);
        assertEquals((long)1, i);
    }

    @Test
    void shouldConvertLongToIntObject() {
        Integer i = TypeConverter.converter((long)1, long.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertLongObjectToIntObject() {
        Integer i = TypeConverter.converter((long)1, Long.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertLongToIntImplicit() {
        int i = TypeConverter.converter((long)1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertLongObjectToIntImplicit() {
        int i = TypeConverter.converter((long)1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertLongToIntObjectImplicit() {
        Integer i = TypeConverter.converter((long)1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertLongObjectToIntObjectImplicit() {
        Integer i = TypeConverter.converter((long)1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertLongToFloat() {
        float f = TypeConverter.converter((long)1, long.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertLongObjectToFloat() {
        float f = TypeConverter.converter((long)1, Long.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertLongToFloatObject() {
        Float f = TypeConverter.converter((long)1, long.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertLongObjectToFloatObject() {
        Float f = TypeConverter.converter((long)1, Long.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertLongToFloatImplicit() {
        float f = TypeConverter.converter((long)1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertLongObjectToFloatImplicit() {
        float f = TypeConverter.converter((long)1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertLongToFloatObjectImplicit() {
        Float f = TypeConverter.converter((long)1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertLongObjectToFloatObjectImplicit() {
        Float f = TypeConverter.converter((long)1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertLongToDouble() {
        double d = TypeConverter.converter((long)1, long.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertLongObjectToDouble() {
        double d = TypeConverter.converter((long)1, Long.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertLongToDoubleObject() {
        Double d = TypeConverter.converter((long)1, long.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertLongObjectToDoubleObject() {
        Double d = TypeConverter.converter((long)1, Long.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertLongToDoubleImplicit() {
        double d = TypeConverter.converter((long)1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertLongObjectToDoubleImplicit() {
        double d = TypeConverter.converter((long)1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertLongToDoubleObjectImplicit() {
        Double d = TypeConverter.converter((long)1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertLongObjectToDoubleObjectImplicit() {
        Double d = TypeConverter.converter((long)1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertLongToLong() {
        long l = TypeConverter.converter((long)1, long.class, long.class);
        assertEquals((long)1, l);
    }

    @Test
    void shouldConvertLongObjectToLong() {
        long l = TypeConverter.converter((long)1, Long.class, long.class);
        assertEquals((long)1, l);
    }

    @Test
    void shouldConvertLongToLongObject() {
        Long l = TypeConverter.converter((long)1, long.class, Long.class);
        assertEquals((long)1, l);
    }

    @Test
    void shouldConvertLongObjectToLongObject() {
        Long l = TypeConverter.converter((long)1, Long.class, Long.class);
        assertEquals((long)1, l);
    }

    @Test
    void shouldConvertLongToLongImplicit() {
        long l = TypeConverter.converter((long)1, long.class, long.class);
        assertEquals((long)1, l);
    }

    @Test
    void shouldConvertLongObjectToLongImplicit() {
        long l = TypeConverter.converter((long)1, Long.class, long.class);
        assertEquals((long)1, l);
    }

    @Test
    void shouldConvertLongToLongObjectImplicit() {
        Long l = TypeConverter.converter((long)1, long.class, Long.class);
        assertEquals((long)1, l);
    }

    @Test
    void shouldConvertLongObjectToLongObjectImplicit() {
        Long l = TypeConverter.converter((long)1, Long.class, Long.class);
        assertEquals((long)1, l);
    }

    @Test
    void shouldConvertLongToString() {
        String s = TypeConverter.converter((long)1, long.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertLongObjectToString() {
        String s = TypeConverter.converter((long)1, Long.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertLongToStringImplicit() {
        String s = TypeConverter.converter((long)1, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertLongObjectToStringImplicit() {
        String s = TypeConverter.converter((long)1, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertLongToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter((long)1, long.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertLongObjectToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter((long)1, Long.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertLongToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter((long)1, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertLongObjectToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter((long)1, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertLongToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter((long)1, long.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertLongObjectToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter((long)1, Long.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertLongToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter((long)1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertLongObjectToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter((long)1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

}