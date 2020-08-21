package com.github.lbovolini.mapper;

import org.junit.jupiter.api.Test;

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
}