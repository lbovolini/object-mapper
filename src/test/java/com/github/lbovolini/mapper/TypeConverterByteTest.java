package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterByteTest {

    @Test
    void shouldConvertByteToBoolean() {
        boolean bool = TypeConverter.converter((byte)1, byte.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertByteObjectToBoolean() {
        boolean bool = TypeConverter.converter((byte)1, Byte.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertByteToBooleanObject() {
        Boolean bool = TypeConverter.converter((byte)1, byte.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertByteObjectToBooleanObject() {
        Boolean bool = TypeConverter.converter((byte)1, Byte.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertByteToBooleanImplicit() {
        boolean bool = TypeConverter.converter((byte)1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertByteObjectToBooleanImplicit() {
        boolean bool = TypeConverter.converter((byte)1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertByteToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter((byte)1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertByteObjectToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter((byte)1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertByteToChar() {
        char c = TypeConverter.converter((byte)1, byte.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertByteObjectToChar() {
        char c = TypeConverter.converter((byte)1, Byte.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertByteToCharObject() {
        Character c = TypeConverter.converter((byte)1, byte.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertByteObjectToCharObject() {
        Character c = TypeConverter.converter((byte)1, Byte.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertByteToCharImplicit() {
        char c = TypeConverter.converter((byte)1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertByteObjectToCharImplicit() {
        char c = TypeConverter.converter((byte)1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertByteToCharObjectImplicit() {
        Character c = TypeConverter.converter((byte)1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertByteObjectToCharObjectImplicit() {
        Character c = TypeConverter.converter((byte)1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertByteToByte() {
        byte b = TypeConverter.converter((byte)1, byte.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertByteObjectToByte() {
        byte b = TypeConverter.converter((byte)1, Byte.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertByteToByteObject() {
        Byte b = TypeConverter.converter((byte)1, byte.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertByteObjectToByteObject() {
        Byte b = TypeConverter.converter((byte)1, Byte.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertByteToByteImplicit() {
        byte b = TypeConverter.converter((byte)1, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertByteObjectToByteImplicit() {
        byte b = TypeConverter.converter((byte)1, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertByteToByteObjectImplicit() {
        Byte b = TypeConverter.converter((byte)1, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertByteObjectToByteObjectImplicit() {
        Byte b = TypeConverter.converter((byte)1, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertByteToShort() {
        short s = TypeConverter.converter((byte)1, byte.class, short.class);
        assertEquals(1, s);
    }

    @Test
    void shouldConvertByteObjectToShort() {
        short s = TypeConverter.converter((byte)1, Byte.class, short.class);
        assertEquals(1, s);
    }

    @Test
    void shouldConvertByteToShortObject() {
        Short s = TypeConverter.converter((byte)1, byte.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertObjectByteToShortObject() {
        Short s = TypeConverter.converter((byte)1, Byte.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertByteToShortImplicit() {
        short s = TypeConverter.converter((byte)1, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertByteObjectToShortImplicit() {
        short s = TypeConverter.converter((byte)1, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertByteToShortObjectImplicit() {
        Short s = TypeConverter.converter((byte)1, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertByteObjectToShortObjectImplicit() {
        Short s = TypeConverter.converter((byte)1, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertByteToInt() {
        int i = TypeConverter.converter((byte)1, byte.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertByteObjectToInt() {
        int i = TypeConverter.converter((byte)1, Byte.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertByteToIntObject() {
        Integer i = TypeConverter.converter((byte)1, byte.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertByteObjectToIntObject() {
        Integer i = TypeConverter.converter((byte)1, Byte.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertByteToIntImplicit() {
        int i = TypeConverter.converter((byte)1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertByteObjectToIntImplicit() {
        int i = TypeConverter.converter((byte)1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertByteToIntObjectImplicit() {
        Integer i = TypeConverter.converter((byte)1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertByteObjectToIntObjectImplicit() {
        Integer i = TypeConverter.converter((byte)1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertByteToFloat() {
        float f = TypeConverter.converter((byte)1, byte.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertByteObjectToFloat() {
        float f = TypeConverter.converter((byte)1, Byte.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertByteToFloatObject() {
        Float f = TypeConverter.converter((byte)1, byte.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertByteObjectToFloatObject() {
        Float f = TypeConverter.converter((byte)1, Byte.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertByteToFloatImplicit() {
        float f = TypeConverter.converter((byte)1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertByteObjectToFloatImplicit() {
        float f = TypeConverter.converter((byte)1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertByteToFloatObjectImplicit() {
        Float f = TypeConverter.converter((byte)1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertByteObjectToFloatObjectImplicit() {
        Float f = TypeConverter.converter((byte)1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertByteToDouble() {
        double d = TypeConverter.converter((byte)1, byte.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertByteObjectToDouble() {
        double d = TypeConverter.converter((byte)1, Byte.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertByteToDoubleObject() {
        Double d = TypeConverter.converter((byte)1, byte.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertByteObjectToDoubleObject() {
        Double d = TypeConverter.converter((byte)1, Byte.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertByteToDoubleImplicit() {
        double d = TypeConverter.converter((byte)1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertByteObjectToDoubleImplicit() {
        double d = TypeConverter.converter((byte)1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertByteToDoubleObjectImplicit() {
        Double d = TypeConverter.converter((byte)1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertByteObjectToDoubleObjectImplicit() {
        Double d = TypeConverter.converter((byte)1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertByteToLong() {
        long l = TypeConverter.converter((byte)1, byte.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertByteObjectToLong() {
        long l = TypeConverter.converter((byte)1, Byte.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertByteToLongObject() {
        Long l = TypeConverter.converter((byte)1, byte.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertByteObjectToLongObject() {
        Long l = TypeConverter.converter((byte)1, Byte.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertByteToLongImplicit() {
        long l = TypeConverter.converter((byte)1, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertByteObjectToLongImplicit() {
        long l = TypeConverter.converter((byte)1, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertByteToLongObjectImplicit() {
        Long l = TypeConverter.converter((byte)1, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertByteObjectToLongObjectImplicit() {
        Long l = TypeConverter.converter((byte)1, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertByteToString() {
        String s = TypeConverter.converter((byte)1, int.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertByteObjectToString() {
        String s = TypeConverter.converter((byte)1, Byte.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertByteToStringImplicit() {
        String s = TypeConverter.converter((byte)1, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertByteObjectToStringImplicit() {
        String s = TypeConverter.converter((byte)1, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertByteToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter((byte)1, byte.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertByteObjectToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter((byte)1, Byte.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertByteToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter((byte)1, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertByteObjectToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter((byte)1, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertByteToBigInteger() {
        BigInteger bigByte = TypeConverter.converter((byte)1, byte.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigByte);
    }

    @Test
    void shouldConvertByteObjectToBigInteger() {
        BigInteger bigByte = TypeConverter.converter((byte)1, Byte.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigByte);
    }

    @Test
    void shouldConvertByteToBigIntegerImplicit() {
        BigInteger bigByte = TypeConverter.converter((byte)1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigByte);
    }

    @Test
    void shouldConvertByteObjectToBigIntegerImplicit() {
        BigInteger bigByte = TypeConverter.converter((byte)1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigByte);
    }
}