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


}