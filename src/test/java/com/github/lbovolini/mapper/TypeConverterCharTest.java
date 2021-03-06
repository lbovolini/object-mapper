package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TypeConverterCharTest {

    @Test
    void shouldConvertCharToBoolean() {
        boolean bool = TypeConverter.converter('1', char.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertCharObjectToBoolean() {
        boolean bool = TypeConverter.converter('1', Character.class, boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertCharToBooleanObject() {
        Boolean bool = TypeConverter.converter('1', char.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertCharObjectToBooleanObject() {
        Boolean bool = TypeConverter.converter('1', Character.class, Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertCharToBooleanImplicit() {
        boolean bool = TypeConverter.converter('1', boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertCharObjectToBooleanImplicit() {
        boolean bool = TypeConverter.converter('1', boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertCharToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter('1', Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertCharObjectToBooleanObjectImplicit() {
        Boolean bool = TypeConverter.converter('1', Boolean.class);
        assertEquals(true, bool);
    }

    @Test
    void shouldConvertCharToByte() {
        byte b = TypeConverter.converter('1', char.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertCharObjectToByte() {
        byte b = TypeConverter.converter('1', Character.class, byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertCharToByteObject() {
        Byte b = TypeConverter.converter('1', char.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertCharObjectToByteObject() {
        Byte b = TypeConverter.converter('1', Character.class, Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertCharToByteImplicit() {
        byte b = TypeConverter.converter('1', byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertCharObjectToByteImplicit() {
        byte b = TypeConverter.converter('1', byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertCharToByteObjectImplicit() {
        Byte b = TypeConverter.converter('1', Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertCharObjectToByteObjectImplicit() {
        Byte b = TypeConverter.converter('1', Byte.class);
        assertEquals((byte)1, b);
    }

    @Test
    void shouldConvertCharToShort() {
        short s = TypeConverter.converter( '1', char.class, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertCharObjectToShort() {
        short s = TypeConverter.converter( '1', Character.class, short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertCharToShortObject() {
        Short s = TypeConverter.converter( '1', char.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertObjectCharToShortObject() {
        Short s = TypeConverter.converter( '1', Character.class, Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertCharToShortImplicit() {
        short s = TypeConverter.converter( '1', short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertCharObjectToShortImplicit() {
        short s = TypeConverter.converter( '1', short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertCharToShortObjectImplicit() {
        Short s = TypeConverter.converter( '1', Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertCharObjectToShortObjectImplicit() {
        Short s = TypeConverter.converter( '1', Short.class);
        assertEquals((short)1, s);
    }

    @Test
    void shouldConvertCharToInt() {
        int i = TypeConverter.converter('1', char.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertCharObjectToInt() {
        int i = TypeConverter.converter('1', Character.class, int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertCharToIntObject() {
        Integer i = TypeConverter.converter('1', char.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertCharObjectToIntObject() {
        Integer i = TypeConverter.converter('1', Character.class, Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertCharToIntImplicit() {
        int i = TypeConverter.converter('1', int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertCharObjectToIntImplicit() {
        int i = TypeConverter.converter('1', int.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertCharToIntObjectImplicit() {
        Integer i = TypeConverter.converter('1', Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertCharObjectToIntObjectImplicit() {
        Integer i = TypeConverter.converter('1', Integer.class);
        assertEquals(1, i);
    }

    @Test
    void shouldConvertCharToFloat() {
        float f = TypeConverter.converter('1', char.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertCharObjectToFloat() {
        float f = TypeConverter.converter('1', Character.class, float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertCharToFloatObject() {
        Float f = TypeConverter.converter('1', char.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertCharObjectToFloatObject() {
        Float f = TypeConverter.converter('1', Character.class, Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertCharToFloatImplicit() {
        float f = TypeConverter.converter('1', float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertCharObjectToFloatImplicit() {
        float f = TypeConverter.converter('1', float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertCharToFloatObjectImplicit() {
        Float f = TypeConverter.converter('1', Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertCharObjectToFloatObjectImplicit() {
        Float f = TypeConverter.converter('1', Float.class);
        assertEquals(1, f);
    }

    @Test
    void shouldConvertCharToDouble() {
        double d = TypeConverter.converter('1', char.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertCharObjectToDouble() {
        double d = TypeConverter.converter('1', Character.class, double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertCharToDoubleObject() {
        Double d = TypeConverter.converter('1', char.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertCharObjectToDoubleObject() {
        Double d = TypeConverter.converter('1', Character.class, Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertCharToDoubleImplicit() {
        double d = TypeConverter.converter('1', double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertCharObjectToDoubleImplicit() {
        double d = TypeConverter.converter('1', double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertCharToDoubleObjectImplicit() {
        Double d = TypeConverter.converter('1', Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertCharObjectToDoubleObjectImplicit() {
        Double d = TypeConverter.converter('1', Double.class);
        assertEquals(1.0, d);
    }

    @Test
    void shouldConvertCharToLong() {
        long l = TypeConverter.converter('1', char.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertCharObjectToLong() {
        long l = TypeConverter.converter('1', Character.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertCharToLongObject() {
        Long l = TypeConverter.converter('1', char.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertCharObjectToLongObject() {
        Long l = TypeConverter.converter('1', Character.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertCharToLongImplicit() {
        long l = TypeConverter.converter('1', char.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertCharObjectToLongImplicit() {
        long l = TypeConverter.converter('1', Character.class, long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertCharToLongObjectImplicit() {
        Long l = TypeConverter.converter('1', char.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shouldConvertCharObjectToLongObjectImplicit() {
        Long l = TypeConverter.converter('1', Character.class, Long.class);
        assertEquals(1, l);
    }

    @Test
    void shoulConvertCharToString() {
        String s = TypeConverter.converter('1', char.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shoulConvertCharObjectToString() {
        String s = TypeConverter.converter('1', Character.class, String.class);
        assertEquals("1", s);
    }

    @Test
    void shoulConvertCharToStringImplicit() {
        String s = TypeConverter.converter('1', String.class);
        assertEquals("1", s);
    }

    @Test
    void shoulConvertCharObjectToStringImplicit() {
        String s = TypeConverter.converter('1', String.class);
        assertEquals("1", s);
    }

    @Test
    void shouldConvertCharToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter('1', char.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertCharObjectToBigDecimal() {
        BigDecimal bigDecimal = TypeConverter.converter('1', Character.class, BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertCharToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter('1', BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertCharObjectToBigDecimalImplicit() {
        BigDecimal bigDecimal = TypeConverter.converter('1', BigDecimal.class);
        assertEquals(BigDecimal.ONE, bigDecimal);
    }

    @Test
    void shouldConvertCharToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter('1', char.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertCharObjectToBigInteger() {
        BigInteger bigInteger = TypeConverter.converter('1', Character.class, BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertCharToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter('1', BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }

    @Test
    void shouldConvertCharObjectToBigIntegerImplicit() {
        BigInteger bigInteger = TypeConverter.converter('1', BigInteger.class);
        assertEquals(BigInteger.ONE, bigInteger);
    }
}