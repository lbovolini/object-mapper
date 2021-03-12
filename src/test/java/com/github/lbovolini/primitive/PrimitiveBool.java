package com.github.lbovolini.primitive;

import java.util.Objects;

public class PrimitiveBool {

    private boolean boolValue;

    public PrimitiveBool() {
    }

    public PrimitiveBool(boolean boolValue) {
        this.boolValue = boolValue;
    }

    public boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(boolean boolValue) {
        this.boolValue = boolValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimitiveBool that = (PrimitiveBool) o;
        return boolValue == that.boolValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(boolValue);
    }
}