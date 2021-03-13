package com.github.lbovolini.dto;

import java.util.Objects;

public class StudentDTO {

    private int id;
    private String name;
    private String email;
    private String password;
    private int courseId;

    public StudentDTO() {
    }

    public StudentDTO(int id, String name, String email, String password, int courseId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.courseId = courseId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDTO studentDTO = (StudentDTO) o;
        return id == studentDTO.id &&
                courseId == studentDTO.courseId &&
                Objects.equals(name, studentDTO.name) &&
                Objects.equals(email, studentDTO.email) &&
                Objects.equals(password, studentDTO.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, courseId);
    }
}
