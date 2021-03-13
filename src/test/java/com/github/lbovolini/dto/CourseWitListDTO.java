package com.github.lbovolini.dto;

import java.util.List;
import java.util.Objects;

public class CourseWitListDTO extends CourseDTO {

    private List<StudentDTOFull> studentDTOList;

    public CourseWitListDTO() {
        super();
    }

    public CourseWitListDTO(CourseDTO courseDTO, List<StudentDTOFull> studentDTOList) {
        super(courseDTO.getId(), courseDTO.getName());
        this.studentDTOList = studentDTOList;
    }

    public List<StudentDTOFull> getStudentDTOList() {
        return studentDTOList;
    }

    public void setStudentDTOList(List<StudentDTOFull> studentDTOList) {
        this.studentDTOList = studentDTOList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CourseWitListDTO that = (CourseWitListDTO) o;
        return Objects.equals(studentDTOList, that.studentDTOList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentDTOList);
    }
}
