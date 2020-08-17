package com.github.lbovolini.dto;

import java.util.Objects;
import java.util.Set;

public class CourseWithSetDTO extends CourseDTO {

    private Set<StudentDTO> studentDTOSet;

    public Set<StudentDTO> getStudentDTOSet() {
        return studentDTOSet;
    }

    public void setStudentDTOSet(Set<StudentDTO> studentDTOSet) {
        this.studentDTOSet = studentDTOSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CourseWithSetDTO that = (CourseWithSetDTO) o;
        return Objects.equals(studentDTOSet, that.studentDTOSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentDTOSet);
    }
}
