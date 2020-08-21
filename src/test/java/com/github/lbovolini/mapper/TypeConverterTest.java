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


}