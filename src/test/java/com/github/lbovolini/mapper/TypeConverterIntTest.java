package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterIntTest {

    @Test
    void shouldConvertIntToBoolean() {
        boolean bool = TypeConverter.converter(1, int.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertIntObjectToBoolean() {
        boolean bool = TypeConverter.converter(1, Integer.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertIntToBooleanObject() {
        Boolean bool = TypeConverter.converter(1, int.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertIntObjectToBooleanObject() {
        Boolean bool = TypeConverter.converter(1, Integer.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertIntToBooleanImplicit() {
        boolean bool = TypeConverter.converter(1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertIntObjectToBooleanImplicit() {
        boolean bool = TypeConverter.converter(1, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertIntToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter(1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertIntObjectToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter(1, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertIntToChar() {
        char c = TypeConverter.converter(1, int.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertIntObjectToChar() {
        char c = TypeConverter.converter(1, Integer.class, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertIntToCharObject() {
        Character c = TypeConverter.converter(1, int.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertIntObjectToCharObject() {
        Character c = TypeConverter.converter(1, Integer.class, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertIntToCharImplicit() {
        char c = TypeConverter.converter(1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertIntObjectToCharImplicit() {
        char c = TypeConverter.converter(1, char.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertIntToCharObjectImplicit() {
        Character c = TypeConverter.converter(1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertIntObjectToCharObjectImplicit() {
        Character c = TypeConverter.converter(1, Character.class);
        assertEquals('1', c);
    }

    @Test
    void shouldConvertIntToByte() {
        byte b = TypeConverter.converter(1, int.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertIntObjectToByte() {
        byte b = TypeConverter.converter(1, Integer.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertIntToByteObject() {
        Byte b = TypeConverter.converter(1, int.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertIntObjectToByteObject() {
        Byte b = TypeConverter.converter(1, Integer.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertIntToByteImplicit() {
        byte b = TypeConverter.converter(1, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertIntObjectToByteImplicit() {
        byte b = TypeConverter.converter(1, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertIntToByteObjectImplicit() {
        Byte b = TypeConverter.converter(1, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertIntObjectToByteObjectImplicit() {
        Byte b = TypeConverter.converter(1, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertIntToShort() {
        short s = TypeConverter.converter(1, int.class, short.class);
        assertEquals(1, s);
    }

    @Test
    void shouldConvertIntObjectToShort() {
        short s = TypeConverter.converter(1, Integer.class, short.class);
        assertEquals(1, s);
    }

    @Test
    void shouldConvertIntToShortObject() {
        Short s = TypeConverter.converter(1, int.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertObjectIntToShortObject() {
        Short s = TypeConverter.converter(1, Integer.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertIntToShortImplicit() {
        short s = TypeConverter.converter(1, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertIntObjectToShortImplicit() {
        short s = TypeConverter.converter(1, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertIntToShortObjectImplicit() {
        Short s = TypeConverter.converter(1, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertIntObjectToShortObjectImplicit() {
        Short s = TypeConverter.converter(1, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertIntToInt() {
        int i = TypeConverter.converter(1, int.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertIntObjectToInt() {
        int i = TypeConverter.converter(1, Integer.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertIntToIntObject() {
        Integer i = TypeConverter.converter(1, int.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertIntObjectToIntObject() {
        Integer i = TypeConverter.converter(1, Integer.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertIntToIntImplicit() {
        int i = TypeConverter.converter(1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertIntObjectToIntImplicit() {
        int i = TypeConverter.converter(1, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertIntToIntObjectImplicit() {
        Integer i = TypeConverter.converter(1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertIntObjectToIntObjectImplicit() {
        Integer i = TypeConverter.converter(1, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertIntToFloat() {
        float f = TypeConverter.converter(1, int.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertIntObjectToFloat() {
        float f = TypeConverter.converter(1, Integer.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertIntToFloatObject() {
        Float f = TypeConverter.converter(1, int.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertIntObjectToFloatObject() {
        Float f = TypeConverter.converter(1, Integer.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertIntToFloatImplicit() {
        float f = TypeConverter.converter(1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertIntObjectToFloatImplicit() {
        float f = TypeConverter.converter(1, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertIntToFloatObjectImplicit() {
        Float f = TypeConverter.converter(1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertIntObjectToFloatObjectImplicit() {
        Float f = TypeConverter.converter(1, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertIntToDouble() {
        double d = TypeConverter.converter(1, int.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertIntObjectToDouble() {
        double d = TypeConverter.converter(1, Integer.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertIntToDoubleObject() {
        Double d = TypeConverter.converter(1, int.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertIntObjectToDoubleObject() {
        Double d = TypeConverter.converter(1, Integer.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertIntToDoubleImplicit() {
        double d = TypeConverter.converter(1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertIntObjectToDoubleImplicit() {
        double d = TypeConverter.converter(1, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertIntToDoubleObjectImplicit() {
        Double d = TypeConverter.converter(1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertIntObjectToDoubleObjectImplicit() {
        Double d = TypeConverter.converter(1, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertIntToLong() {
        long l = TypeConverter.converter(1, int.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertIntObjectToLong() {
        long l = TypeConverter.converter(1, Integer.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertIntToLongObject() {
        Long l = TypeConverter.converter(1, int.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertIntObjectToLongObject() {
        Long l = TypeConverter.converter(1, Integer.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertIntToLongImplicit() {
        long l = TypeConverter.converter(1, int.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertIntObjectToLongImplicit() {
        long l = TypeConverter.converter(1, Integer.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertIntToLongObjectImplicit() {
        Long l = TypeConverter.converter(1, int.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertIntObjectToLongObjectImplicit() {
        Long l = TypeConverter.converter(1, Integer.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertIntToString() {
        String s = TypeConverter.converter(1, int.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertIntObjectToString() {
        String s = TypeConverter.converter(1, Integer.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertIntToStringImplicit() {
        String s = TypeConverter.converter(1, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertIntObjectToStringImplicit() {
        String s = TypeConverter.converter(1, String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertIntToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter(1, int.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertIntObjectToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter(1, Integer.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertIntToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter(1, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertIntObjectToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter(1, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertIntToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter(1, int.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertIntObjectToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter(1, Integer.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertIntToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter(1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertIntObjectToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter(1, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

}