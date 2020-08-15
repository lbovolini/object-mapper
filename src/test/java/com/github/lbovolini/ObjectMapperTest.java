package com.github.lbovolini;

import com.github.lbovolini.dto.CourseDTO;
import com.github.lbovolini.dto.StudentDTO;
import com.github.lbovolini.dto.StudentDTOFull;
import com.github.lbovolini.mapper.ObjectMapper;
import com.github.lbovolini.model.Course;
import com.github.lbovolini.model.Student;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ObjectMapperTest {

    private final int id = 1;
    private final String name = "Lucas Bovolini";
    private final String email = "lucasbovolini@hotmail.com";
    private final String password = "password123";
    private final LocalDate birthday = LocalDate.of(1994, 7, 18);
    private final int courseId = 1;
    private final String couseName = "Sistemas de Informação";

    @Test
    void shouldConvertModelToDTO() {

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        student.setBirthday(birthday);
        student.setCourseId(courseId);

        StudentDTO studentDTO = ObjectMapper.map(student, StudentDTO.class);

        assertEquals(id, studentDTO.getId());
        assertEquals(name, studentDTO.getName());
        assertEquals(email, studentDTO.getEmail());
        assertEquals(password, studentDTO.getPassword());
        assertEquals(birthday, studentDTO.getBirthday());
        assertEquals(courseId, studentDTO.getCourseId());
    }

    @Test
    void shouldConvertDTOToModel() {

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(id);
        studentDTO.setName(name);
        studentDTO.setEmail(email);
        studentDTO.setPassword(password);
        studentDTO.setBirthday(birthday);
        studentDTO.setCourseId(courseId);

        Student student = ObjectMapper.map(studentDTO, Student.class);

        assertEquals(id, student.getId());
        assertEquals(name, student.getName());
        assertEquals(email, student.getEmail());
        assertEquals(password, student.getPassword());
        assertEquals(birthday, student.getBirthday());
        assertEquals(courseId, student.getCourseId());
    }

    @Test
    void shouldConvertStudentDTOFullToStudent() {

        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(courseId);
        courseDTO.setName(couseName);

        Course course = new Course();
        course.setId(courseId);
        course.setName(couseName);

        StudentDTOFull studentDTOFull = new StudentDTOFull();
        studentDTOFull.setId(id);
        studentDTOFull.setName(name);
        studentDTOFull.setEmail(email);
        studentDTOFull.setPassword(password);
        studentDTOFull.setBirthday(birthday);
        studentDTOFull.setCourseId(courseId);
        studentDTOFull.setCourseDTO(courseDTO);

        Student student = ObjectMapper.map(studentDTOFull, Student.class);

        assertEquals(id, student.getId());
        assertEquals(name, student.getName());
        assertEquals(email, student.getEmail());
        assertEquals(password, student.getPassword());
        assertEquals(birthday, student.getBirthday());
        assertEquals(courseId, student.getCourseId());
        assertEquals(course, student.getCourse());
    }

    @Test
    void shouldConvertStudentToStudentDTOFull() {

        Course course = new Course();
        course.setId(courseId);
        course.setName(couseName);

        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(courseId);
        courseDTO.setName(couseName);

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        student.setBirthday(birthday);
        student.setCourseId(courseId);
        student.setCourse(course);

        StudentDTOFull studentDTOFull = ObjectMapper.map(student, StudentDTOFull.class);

        assertEquals(id, studentDTOFull.getId());
        assertEquals(name, studentDTOFull.getName());
        assertEquals(email, studentDTOFull.getEmail());
        assertEquals(password, studentDTOFull.getPassword());
        assertEquals(birthday, studentDTOFull.getBirthday());
        assertEquals(courseId, studentDTOFull.getCourseId());
        assertEquals(courseDTO, studentDTOFull.getCourseDTO());
    }

    @Test
    void performanceTest() {

        long start = System.nanoTime();
        int repeat = 1_000_000;

        for (int i = 0; i < repeat; i++) {

            int id = new Random().nextInt();
            String name = this.name + new Random().nextInt();
            String email = this.email + new Random().nextInt();
            String password = this.password + new Random().nextInt();
            LocalDate birthday = this.birthday.minusDays(new Random().nextInt());
            int courseId = new Random().nextInt();

            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setEmail(email);
            student.setPassword(password);
            student.setBirthday(birthday);
            student.setCourseId(courseId);

            StudentDTO studentDTO = ObjectMapper.map(student, StudentDTO.class);

            assertEquals(id, studentDTO.getId());
            assertEquals(name, studentDTO.getName());
            assertEquals(email, studentDTO.getEmail());
            assertEquals(password, studentDTO.getPassword());
            assertEquals(birthday, studentDTO.getBirthday());
            assertEquals(courseId, studentDTO.getCourseId());
        }

        long end = System.nanoTime();

        System.out.println((end - start) / 1_000_000_000.0);
    }

    @Test
    void performanceTest2() {

        long start = System.nanoTime();
        int repeat = 1_000_000;

        for (int i = 0; i < repeat; i++) {

            int id = new Random().nextInt();
            String name = this.name + new Random().nextInt();
            String email = this.email + new Random().nextInt();
            String password = this.password + new Random().nextInt();
            LocalDate birthday = this.birthday.minusDays(new Random().nextInt());
            int courseId = new Random().nextInt();

            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setEmail(email);
            student.setPassword(password);
            student.setBirthday(birthday);
            student.setCourseId(courseId);

            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setId(student.getId());
            studentDTO.setName(student.getName());
            studentDTO.setEmail(student.getEmail());
            studentDTO.setPassword(student.getPassword());
            studentDTO.setBirthday(student.getBirthday());
            studentDTO.setCourseId(student.getCourseId());

            assertEquals(id, studentDTO.getId());
            assertEquals(name, studentDTO.getName());
            assertEquals(email, studentDTO.getEmail());
            assertEquals(password, studentDTO.getPassword());
            assertEquals(birthday, studentDTO.getBirthday());
            assertEquals(courseId, studentDTO.getCourseId());
        }

        long end = System.nanoTime();

        System.out.println((end - start) / 1_000_000_000.0);
    }
}