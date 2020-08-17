package com.github.lbovolini.model;

import java.util.Map;
import java.util.Objects;

public class CourseWithMap extends Course {

    private Map<String, Student> studentMap;

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CourseWithMap that = (CourseWithMap) o;
        return Objects.equals(studentMap, that.studentMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentMap);
    }
}
