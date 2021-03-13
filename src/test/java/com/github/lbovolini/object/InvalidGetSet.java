package com.github.lbovolini.object;

public class InvalidGetSet {

    private int i;
    private int dto;

    public int get() {
        return i;
    }

    public void set(int i) {
        this.i = i;
    }

    public int getDto() {
        return dto;
    }

    public void setDto(int dto) {
        this.dto = dto;
    }
}
