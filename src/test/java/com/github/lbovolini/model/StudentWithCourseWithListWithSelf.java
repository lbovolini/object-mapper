package com.github.lbovolini.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class StudentWithCourseWithListWithSelf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    //private LocalDate birthday;
    @Column(name = "Curso_id")
    private int courseId;

    @ManyToOne
    @JoinColumn(name = "Curso_id", insertable = false, updatable = false)
    private CourseWithListWithStudentWithSelf courseWithListWithStudentWithSelf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public CourseWithListWithStudentWithSelf getCourseWithListWithStudentWithSelf() {
        return courseWithListWithStudentWithSelf;
    }

    public void setCourseWithListWithStudentWithSelf(CourseWithListWithStudentWithSelf courseWithListWithStudentWithSelf) {
        this.courseWithListWithStudentWithSelf = courseWithListWithStudentWithSelf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentWithCourseWithListWithSelf that = (StudentWithCourseWithListWithSelf) o;
        return id == that.id &&
                courseId == that.courseId &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(password, that.password) &&
                Objects.equals(courseWithListWithStudentWithSelf, that.courseWithListWithStudentWithSelf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, courseId, courseWithListWithStudentWithSelf);
    }
}
