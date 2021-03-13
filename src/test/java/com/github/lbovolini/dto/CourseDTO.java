package com.github.lbovolini.dto;

import java.util.Objects;

public class CourseDTO {

    private int id;
    private String name;

    public CourseDTO() {
    }

    public CourseDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseDTO courseDTO = (CourseDTO) o;
        return id == courseDTO.id &&
                Objects.equals(name, courseDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
