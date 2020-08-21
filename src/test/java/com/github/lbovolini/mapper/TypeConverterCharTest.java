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
}