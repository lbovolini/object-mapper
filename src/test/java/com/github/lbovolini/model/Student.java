package com.github.lbovolini.model;

import java.util.Objects;

public class Student {

    private int id;
    private String name;
    private String email;
    private String password;
    private int courseId;

    private Course course;

    public Student() {
    }

    public Student(int id, String name, String email, String password, int courseId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.courseId = courseId;
    }

    public Student(int id, String name, String email, String password, int courseId, Course course) {
        this(id, name, email, password, courseId);
        this.course = course;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                courseId == student.courseId &&
                Objects.equals(name, student.name) &&
                Objects.equals(email, student.email) &&
                Objects.equals(password, student.password) &&
                Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, course, courseId);
    }
}