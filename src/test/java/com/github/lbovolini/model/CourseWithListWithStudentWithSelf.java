package com.github.lbovolini.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class CourseWithListWithStudentWithSelf extends Course {

    @OneToMany(mappedBy = "course", fetch= FetchType.EAGER)
    private List<StudentWithCourseWithListWithSelf> studentWithCourseWithListWithSelfList;

    public List<StudentWithCourseWithListWithSelf> getStudentWithCourseWithListWithSelfList() {
        return studentWithCourseWithListWithSelfList;
    }

    public void setStudentWithCourseWithListWithSelfList(List<StudentWithCourseWithListWithSelf> studentWithCourseWithListWithSelfList) {
        this.studentWithCourseWithListWithSelfList = studentWithCourseWithListWithSelfList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CourseWithListWithStudentWithSelf that = (CourseWithListWithStudentWithSelf) o;
        return Objects.equals(studentWithCourseWithListWithSelfList, that.studentWithCourseWithListWithSelfList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentWithCourseWithListWithSelfList);
    }
}
