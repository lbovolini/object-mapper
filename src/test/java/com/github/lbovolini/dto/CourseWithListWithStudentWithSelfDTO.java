package com.github.lbovolini.dto;

import java.util.List;

public class CourseWithListWithStudentWithSelfDTO extends CourseDTO {

    private List<StudentWithCourseWithListWithSelfDTO> studentWithCourseWithListWithSelfDTOList;

    public List<StudentWithCourseWithListWithSelfDTO> getStudentWithCourseWithListWithSelfDTOList() {
        return studentWithCourseWithListWithSelfDTOList;
    }

    public void setStudentWithCourseWithListWithSelfDTOList(List<StudentWithCourseWithListWithSelfDTO> studentWithCourseWithListWithSelfDTOList) {
        this.studentWithCourseWithListWithSelfDTOList = studentWithCourseWithListWithSelfDTOList;
    }
}
