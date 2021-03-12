package com.github.lbovolini.dto;

import java.util.Objects;

public class PrimitiveTypeDTO {

    private boolean boolValue;
    private byte byteValue;
    private char charValue;
    private short shortValue;
    private int intValue;
    private float floatValue;
    private double doubleValue;
    private long longValue;

    public PrimitiveTypeDTO() {
    }

    public PrimitiveTypeDTO(boolean boolValue, byte byteValue, char charValue, short shortValue, int intValue, float floatValue, double doubleValue, long longValue) {
        this.boolValue = boolValue;
        this.byteValue = byteValue;
        this.charValue = charValue;
        this.shortValue = shortValue;
        this.intValue = intValue;
        this.floatValue = floatValue;
        this.doubleValue = doubleValue;
        this.longValue = longValue;
    }

    public boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(boolean boolValue) {
        this.boolValue = boolValue;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimitiveTypeDTO that = (PrimitiveTypeDTO) o;
        return boolValue == that.boolValue && byteValue == that.byteValue && charValue == that.charValue && shortValue == that.shortValue && intValue == that.intValue && Float.compare(that.floatValue, floatValue) == 0 && Double.compare(that.doubleValue, doubleValue) == 0 && longValue == that.longValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(boolValue, byteValue, charValue, shortValue, intValue, floatValue, doubleValue, longValue);
    }
}
