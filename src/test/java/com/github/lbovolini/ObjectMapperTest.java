package com.github.lbovolini;

import com.github.lbovolini.dto.*;
import com.github.lbovolini.mapper.ObjectMapper;
import com.github.lbovolini.model.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

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
    void shouldConvertCourseWithListToCourseWithListDTO() {

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

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(id);
        studentDTO.setName(name);
        studentDTO.setEmail(email);
        studentDTO.setPassword(password);
        studentDTO.setBirthday(birthday);
        studentDTO.setCourseId(courseId);

        StudentDTOFull studentDTOFull = new StudentDTOFull();
        studentDTOFull.setId(id);
        studentDTOFull.setName(name);
        studentDTOFull.setEmail(email);
        studentDTOFull.setPassword(password);
        studentDTOFull.setBirthday(birthday);
        studentDTOFull.setCourseId(courseId);
        studentDTOFull.setCourseDTO(courseDTO);

        int id = new Random().nextInt();
        String name = this.name + new Random().nextInt();
        String email = this.email + new Random().nextInt();
        String password = this.password + new Random().nextInt();
        LocalDate birthday = this.birthday.minusDays(new Random().nextInt());
        int courseId = new Random().nextInt();

        Student student1 = new Student();
        student1.setId(id);
        student1.setName(name);
        student1.setEmail(email);
        student1.setPassword(password);
        student1.setBirthday(birthday);
        student1.setCourseId(courseId);
        student1.setCourse(course);

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.setId(id);
        studentDTO1.setName(name);
        studentDTO1.setEmail(email);
        studentDTO1.setPassword(password);
        studentDTO1.setBirthday(birthday);
        studentDTO1.setCourseId(courseId);

        StudentDTOFull studentDTOFull1 = new StudentDTOFull();
        studentDTOFull1.setId(id);
        studentDTOFull1.setName(name);
        studentDTOFull1.setEmail(email);
        studentDTOFull1.setPassword(password);
        studentDTOFull1.setBirthday(birthday);
        studentDTOFull1.setCourseId(courseId);
        studentDTOFull1.setCourseDTO(courseDTO);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);

        List<StudentDTO> studentDTOList = new ArrayList<>();
        studentDTOList.add(studentDTO);
        studentDTOList.add(studentDTO1);

        CourseWithList courseWithList = new CourseWithList();
        courseWithList.setId(this.courseId);
        courseWithList.setName(couseName);
        courseWithList.setStudentList(studentList);

        CourseWitListDTO courseWitListDTO = ObjectMapper.map(courseWithList, CourseWitListDTO.class);

        assertEquals(this.courseId, courseWitListDTO.getId());
        assertEquals(couseName, courseWitListDTO.getName());

        List<StudentDTO> studentDTOList1 = courseWitListDTO.getStudentDTOList();
        assertEquals(studentDTOList, studentDTOList1);
    }

    @Test
    void shouldConvertCourseWithSetToCourseWithSetDTO() {

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        student.setBirthday(birthday);
        student.setCourseId(courseId);

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(id);
        studentDTO.setName(name);
        studentDTO.setEmail(email);
        studentDTO.setPassword(password);
        studentDTO.setBirthday(birthday);
        studentDTO.setCourseId(courseId);

        int id = new Random().nextInt();
        String name = this.name + new Random().nextInt();
        String email = this.email + new Random().nextInt();
        String password = this.password + new Random().nextInt();
        LocalDate birthday = this.birthday.minusDays(new Random().nextInt());
        int courseId = new Random().nextInt();

        Student student1 = new Student();
        student1.setId(id);
        student1.setName(name);
        student1.setEmail(email);
        student1.setPassword(password);
        student1.setBirthday(birthday);
        student1.setCourseId(courseId);

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.setId(id);
        studentDTO1.setName(name);
        studentDTO1.setEmail(email);
        studentDTO1.setPassword(password);
        studentDTO1.setBirthday(birthday);
        studentDTO1.setCourseId(courseId);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);
        studentSet.add(student1);

        Set<StudentDTO> studentDTOSet = new HashSet<>();
        studentDTOSet.add(studentDTO);
        studentDTOSet.add(studentDTO1);

        CourseWithSet courseWithSet = new CourseWithSet();
        courseWithSet.setId(courseId);
        courseWithSet.setName(couseName);
        courseWithSet.setStudentSet(studentSet);

        CourseWithSetDTO courseWithSetDTO = new CourseWithSetDTO();
        courseWithSetDTO.setId(courseId);
        courseWithSetDTO.setName(couseName);
        courseWithSetDTO.setStudentDTOSet(studentDTOSet);

        CourseWithSetDTO courseWithSetDTO1 = ObjectMapper.map(courseWithSet, CourseWithSetDTO.class);

        assertEquals(studentDTOSet, courseWithSetDTO1.getStudentDTOSet());
    }

    @Test
    void shouldConvertCourseWithSetDTOToCourseWithSet() {

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        student.setBirthday(birthday);
        student.setCourseId(courseId);

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(id);
        studentDTO.setName(name);
        studentDTO.setEmail(email);
        studentDTO.setPassword(password);
        studentDTO.setBirthday(birthday);
        studentDTO.setCourseId(courseId);

        int id = new Random().nextInt();
        String name = this.name + new Random().nextInt();
        String email = this.email + new Random().nextInt();
        String password = this.password + new Random().nextInt();
        LocalDate birthday = this.birthday.minusDays(new Random().nextInt());
        int courseId = new Random().nextInt();

        Student student1 = new Student();
        student1.setId(id);
        student1.setName(name);
        student1.setEmail(email);
        student1.setPassword(password);
        student1.setBirthday(birthday);
        student1.setCourseId(courseId);

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.setId(id);
        studentDTO1.setName(name);
        studentDTO1.setEmail(email);
        studentDTO1.setPassword(password);
        studentDTO1.setBirthday(birthday);
        studentDTO1.setCourseId(courseId);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);
        studentSet.add(student1);

        Set<StudentDTO> studentDTOSet = new HashSet<>();
        studentDTOSet.add(studentDTO);
        studentDTOSet.add(studentDTO1);

        CourseWithSet courseWithSet = new CourseWithSet();
        courseWithSet.setId(courseId);
        courseWithSet.setName(couseName);
        courseWithSet.setStudentSet(studentSet);

        CourseWithSetDTO courseWithSetDTO = new CourseWithSetDTO();
        courseWithSetDTO.setId(courseId);
        courseWithSetDTO.setName(couseName);
        courseWithSetDTO.setStudentDTOSet(studentDTOSet);

        CourseWithSet courseWithSet1 = ObjectMapper.map(courseWithSetDTO, CourseWithSet.class);

        assertEquals(studentSet, courseWithSet1.getStudentSet());
    }

    @Test
    void shouldConvertCourseWithMapDTOToCourseWithMap() {

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        student.setBirthday(birthday);
        student.setCourseId(courseId);

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(id);
        studentDTO.setName(name);
        studentDTO.setEmail(email);
        studentDTO.setPassword(password);
        studentDTO.setBirthday(birthday);
        studentDTO.setCourseId(courseId);

        int id = new Random().nextInt();
        String name = this.name + new Random().nextInt();
        String email = this.email + new Random().nextInt();
        String password = this.password + new Random().nextInt();
        LocalDate birthday = this.birthday.minusDays(new Random().nextInt());
        int courseId = new Random().nextInt();

        Student student1 = new Student();
        student1.setId(id);
        student1.setName(name);
        student1.setEmail(email);
        student1.setPassword(password);
        student1.setBirthday(birthday);
        student1.setCourseId(courseId);

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.setId(id);
        studentDTO1.setName(name);
        studentDTO1.setEmail(email);
        studentDTO1.setPassword(password);
        studentDTO1.setBirthday(birthday);
        studentDTO1.setCourseId(courseId);

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put(student.getName(), student);
        studentMap.put(student1.getName(), student1);

        Map<String, StudentDTO> studentDTOMap = new HashMap<>();
        studentDTOMap.put(studentDTO.getName(), studentDTO);
        studentDTOMap.put(studentDTO1.getName(), studentDTO1);

        CourseWithMap courseWithMap = new CourseWithMap();
        courseWithMap.setId(courseId);
        courseWithMap.setName(couseName);
        courseWithMap.setStudentMap(studentMap);

        CourseWithMapDTO courseWithMapDTO = new CourseWithMapDTO();
        courseWithMapDTO.setId(courseId);
        courseWithMapDTO.setName(couseName);
        courseWithMapDTO.setStudentDTOMap(studentDTOMap);

        CourseWithMap courseWithMap1 = ObjectMapper.map(courseWithMapDTO, CourseWithMap.class);

        assertEquals(studentMap, courseWithMap1.getStudentMap());
    }

    @Test
    void shouldConvertCourseWithMapDTOToCourseWithMapEmptyMap() {

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        student.setBirthday(birthday);
        student.setCourseId(courseId);

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(id);
        studentDTO.setName(name);
        studentDTO.setEmail(email);
        studentDTO.setPassword(password);
        studentDTO.setBirthday(birthday);
        studentDTO.setCourseId(courseId);

        int id = new Random().nextInt();
        String name = this.name + new Random().nextInt();
        String email = this.email + new Random().nextInt();
        String password = this.password + new Random().nextInt();
        LocalDate birthday = this.birthday.minusDays(new Random().nextInt());
        int courseId = new Random().nextInt();

        Student student1 = new Student();
        student1.setId(id);
        student1.setName(name);
        student1.setEmail(email);
        student1.setPassword(password);
        student1.setBirthday(birthday);
        student1.setCourseId(courseId);

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.setId(id);
        studentDTO1.setName(name);
        studentDTO1.setEmail(email);
        studentDTO1.setPassword(password);
        studentDTO1.setBirthday(birthday);
        studentDTO1.setCourseId(courseId);

        Map<String, Student> studentMap = new HashMap<>();

        Map<String, StudentDTO> studentDTOMap = new HashMap<>();

        CourseWithMap courseWithMap = new CourseWithMap();
        courseWithMap.setId(courseId);
        courseWithMap.setName(couseName);
        courseWithMap.setStudentMap(studentMap);

        CourseWithMapDTO courseWithMapDTO = new CourseWithMapDTO();
        courseWithMapDTO.setId(courseId);
        courseWithMapDTO.setName(couseName);
        courseWithMapDTO.setStudentDTOMap(studentDTOMap);

        CourseWithMap courseWithMap1 = ObjectMapper.map(courseWithMapDTO, CourseWithMap.class);

        assertEquals(studentMap, courseWithMap1.getStudentMap());
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