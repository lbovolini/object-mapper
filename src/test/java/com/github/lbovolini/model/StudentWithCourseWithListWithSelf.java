package com.github.lbovolini.model;

import java.util.Objects;

public class StudentWithCourseWithListWithSelf {
    private int id;
    private String name;
    private String email;
    private String password;
    private int courseId;

    private CourseWithListWithStudentWithSelf courseWithListWithStudentWithSelf;

    public StudentWithCourseWithListWithSelf() {
    }

    public StudentWithCourseWithListWithSelf(int id, String name, String email, String password, int courseId, CourseWithListWithStudentWithSelf courseWithListWithStudentWithSelf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.courseId = courseId;
        this.courseWithListWithStudentWithSelf = courseWithListWithStudentWithSelf;
    }

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
