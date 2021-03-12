package com.github.lbovolini.object;

import java.util.Objects;

public class ObjectBool {

    private Boolean boolValue;

    public ObjectBool() {
    }

    public ObjectBool(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    public Boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectBool that = (ObjectBool) o;
        return Objects.equals(boolValue, that.boolValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boolValue);
    }
}
