package com.github.lbovolini.dto;

import java.util.Map;
import java.util.Objects;

public class CourseWithMapDTO extends CourseDTO {

    private Map<String, StudentDTO> studentDTOMap;

    public Map<String, StudentDTO> getStudentDTOMap() {
        return studentDTOMap;
    }

    public void setStudentDTOMap(Map<String, StudentDTO> studentDTOMap) {
        this.studentDTOMap = studentDTOMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CourseWithMapDTO that = (CourseWithMapDTO) o;
        return Objects.equals(studentDTOMap, that.studentDTOMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentDTOMap);
    }
}
