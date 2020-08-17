package com.github.lbovolini.model;

import java.util.Objects;
import java.util.Set;

public class CourseWithSet extends Course {

    private Set<Student> studentSet;

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CourseWithSet that = (CourseWithSet) o;
        return Objects.equals(studentSet, that.studentSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentSet);
    }
}
