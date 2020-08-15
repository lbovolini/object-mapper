package com.github.lbovolini.dto;

import java.time.LocalDate;
import java.util.Objects;

public class StudentDTOFull {

    private int id;
    private String name;
    private String email;
    private String password;
    private LocalDate birthday;
    private int courseId;
    private CourseDTO courseDTO;

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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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
        StudentDTOFull that = (StudentDTOFull) o;
        return id == that.id &&
                courseId == that.courseId &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(password, that.password) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(courseDTO, that.courseDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, birthday, courseId, courseDTO);
    }
}
