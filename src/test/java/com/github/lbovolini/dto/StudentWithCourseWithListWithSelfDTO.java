package com.github.lbovolini.dto;

import java.util.Objects;

public class StudentWithCourseWithListWithSelfDTO extends StudentDTO {

    private CourseWithListWithStudentWithSelfDTO courseWithListWithStudentWithSelfDTO;

    public CourseWithListWithStudentWithSelfDTO getCourseWithListWithStudentWithSelfDTO() {
        return courseWithListWithStudentWithSelfDTO;
    }

    public void setCourseWithListWithStudentWithSelfDTO(CourseWithListWithStudentWithSelfDTO courseWithListWithStudentWithSelfDTO) {
        this.courseWithListWithStudentWithSelfDTO = courseWithListWithStudentWithSelfDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StudentWithCourseWithListWithSelfDTO that = (StudentWithCourseWithListWithSelfDTO) o;
        return Objects.equals(courseWithListWithStudentWithSelfDTO, that.courseWithListWithStudentWithSelfDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), courseWithListWithStudentWithSelfDTO);
    }
}
