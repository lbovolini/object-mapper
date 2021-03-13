package com.github.lbovolini.dto;

import java.util.Objects;

public class StudentDTOFull extends StudentDTO {

    private CourseDTO courseDTO;

    public StudentDTOFull() {
        super();
    }

    public StudentDTOFull(StudentDTO studentDTO, CourseDTO courseDTO) {
        super(studentDTO.getId(), studentDTO.getName(), studentDTO.getEmail(), studentDTO.getPassword(), studentDTO.getCourseId());
        this.courseDTO = courseDTO;
    }

    public CourseDTO getCourseDTO() {
        return courseDTO;
    }

    public void setCourseDTO(CourseDTO courseDTO) {
        this.courseDTO = courseDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StudentDTOFull that = (StudentDTOFull) o;
        return Objects.equals(courseDTO, that.courseDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), courseDTO);
    }
}
