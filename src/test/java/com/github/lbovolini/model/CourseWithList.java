package com.github.lbovolini.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class CourseWithList extends Course {

    @OneToMany(mappedBy = "course", fetch=FetchType.EAGER)
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CourseWithList that = (CourseWithList) o;
        return Objects.equals(studentList, that.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentList);
    }
}