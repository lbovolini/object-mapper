package com.github.lbovolini.model;

import java.util.Objects;

public class BoxedPrimitiveType {

    private Boolean boolValue;
    private Byte byteValue;
    private Character charValue;
    private Short shortValue;
    private Integer intValue;
    private Float floatValue;
    private Double doubleValue;
    private Long longValue;

    public BoxedPrimitiveType() {
    }

    public BoxedPrimitiveType(Boolean boolValue, Byte byteValue, Character charValue, Short shortValue, Integer intValue, Float floatValue, Double doubleValue, Long longValue) {
        this.boolValue = boolValue;
        this.byteValue = byteValue;
        this.charValue = charValue;
        this.shortValue = shortValue;
        this.intValue = intValue;
        this.floatValue = floatValue;
        this.doubleValue = doubleValue;
        this.longValue = longValue;
    }

    public Boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    public Byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(Byte byteValue) {
        this.byteValue = byteValue;
    }

    public Character getCharValue() {
        return charValue;
    }

    public void setCharValue(Character charValue) {
        this.charValue = charValue;
    }

    public Short getShortValue() {
        return shortValue;
    }

    public void setShortValue(Short shortValue) {
        this.shortValue = shortValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Float floatValue) {
        this.floatValue = floatValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoxedPrimitiveType that = (BoxedPrimitiveType) o;
        return Objects.equals(boolValue, that.boolValue) && Objects.equals(byteValue, that.byteValue) && Objects.equals(charValue, that.charValue) && Objects.equals(shortValue, that.shortValue) && Objects.equals(intValue, that.intValue) && Objects.equals(floatValue, that.floatValue) && Objects.equals(doubleValue, that.doubleValue) && Objects.equals(longValue, that.longValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boolValue, byteValue, charValue, shortValue, intValue, floatValue, doubleValue, longValue);
    }
}
