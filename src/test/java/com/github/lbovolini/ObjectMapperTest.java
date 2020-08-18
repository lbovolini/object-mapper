package com.github.lbovolini;

import com.github.lbovolini.dto.*;
import com.github.lbovolini.mapper.ObjectMapper;
import com.github.lbovolini.model.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ObjectMapperTest {

    private static final int id = 1;
    private static final String name = "Lucas Bovolini";
    private static final String email = "lucasbovolini@hotmail.com";
    private static final String password = "password123";
    private static final LocalDate birthday = LocalDate.of(1994, 7, 18);
    private static final int courseId = 1;
    private static final String courseName = "Sistemas de Informação";

    private static final int randId = new Random().nextInt();
    private static final String randName = name + new Random().nextInt();
    private static final String randEmail = email + new Random().nextInt();
    private static final String randPassword = password + new Random().nextInt();
    private static final LocalDate randBirthday = birthday.minusDays(new Random().nextInt());
    private static final int randCourseId = new Random().nextInt();

    private static final Student student = new Student();
    private static final Student student1 = new Student();
    private static final Student studentWithoutCourse = new Student();
    private static final Student studentWithoutCourse1 = new Student();
    private static final StudentDTO studentDTO = new StudentDTO();
    private static final StudentDTO studentDTO1 = new StudentDTO();
    private static final Course course = new Course();
    private static final CourseDTO courseDTO = new CourseDTO();
    private static final StudentDTOFull studentDTOFull = new StudentDTOFull();
    private static final StudentDTOFull studentDTOFull1 = new StudentDTOFull();
    private static final List<Student> studentList = new ArrayList<>();
    private static final List<StudentDTO> studentDTOList = new ArrayList<>();
    private static final List<StudentDTOFull> studentDTOFullList = new ArrayList<>();
    private static final List<StudentDTOFull> studentDTOFullList1 = new ArrayList<>();
    private static final CourseWithList courseWithList = new CourseWithList();
    private static final CourseWithList courseWithList1 = new CourseWithList();
    private static final CourseWitListDTO courseWitListDTO = new CourseWitListDTO();
    private static final CourseWitListDTO courseWitListDTO1 = new CourseWitListDTO();

    static {
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        student.setBirthday(birthday);
        student.setCourseId(courseId);
        student.setCourse(course);

        student1.setId(randId);
        student1.setName(randName);
        student1.setEmail(randEmail);
        student1.setPassword(randPassword);
        student1.setBirthday(randBirthday);
        student1.setCourseId(randCourseId);
        student1.setCourse(course);

        studentWithoutCourse.setId(id);
        studentWithoutCourse.setName(name);
        studentWithoutCourse.setEmail(email);
        studentWithoutCourse.setPassword(password);
        studentWithoutCourse.setBirthday(birthday);
        studentWithoutCourse.setCourseId(courseId);

        studentWithoutCourse1.setId(randId);
        studentWithoutCourse1.setName(randName);
        studentWithoutCourse1.setEmail(randEmail);
        studentWithoutCourse1.setPassword(randPassword);
        studentWithoutCourse1.setBirthday(randBirthday);
        studentWithoutCourse1.setCourseId(randCourseId);

        studentDTO.setId(id);
        studentDTO.setName(name);
        studentDTO.setEmail(email);
        studentDTO.setPassword(password);
        studentDTO.setBirthday(birthday);
        studentDTO.setCourseId(courseId);

        studentDTO1.setId(randId);
        studentDTO1.setName(randName);
        studentDTO1.setEmail(randEmail);
        studentDTO1.setPassword(randPassword);
        studentDTO1.setBirthday(randBirthday);
        studentDTO1.setCourseId(randCourseId);

        course.setId(courseId);
        course.setName(courseName);

        courseDTO.setId(courseId);
        courseDTO.setName(courseName);

        studentDTOFull.setId(id);
        studentDTOFull.setName(name);
        studentDTOFull.setEmail(email);
        studentDTOFull.setPassword(password);
        studentDTOFull.setBirthday(birthday);
        studentDTOFull.setCourseId(courseId);
        studentDTOFull.setCourseDTO(courseDTO);

        studentDTOFull1.setId(randId);
        studentDTOFull1.setName(randName);
        studentDTOFull1.setEmail(randEmail);
        studentDTOFull1.setPassword(randPassword);
        studentDTOFull1.setBirthday(randBirthday);
        studentDTOFull1.setCourseId(randCourseId);
        studentDTOFull1.setCourseDTO(courseDTO);

        studentList.add(student);
        studentList.add(student1);

        studentDTOList.add(studentDTO);
        studentDTOList.add(studentDTO1);

        studentDTOFullList.add(studentDTOFull);
        studentDTOFullList.add(studentDTOFull1);

        studentDTOFullList1.add(studentDTOFull);
        studentDTOFullList1.add(studentDTOFull1);

        courseWithList.setId(courseId);
        courseWithList.setName(courseName);
        courseWithList.setStudentList(studentList);

        courseWithList1.setId(randId);
        courseWithList1.setName(randName);
        courseWithList1.setStudentList(studentList);

        courseWitListDTO.setId(courseId);
        courseWitListDTO.setName(courseName);
        courseWitListDTO.setStudentDTOList(studentDTOFullList);

        courseWitListDTO1.setId(randId);
        courseWitListDTO1.setName(randName);
        courseWitListDTO1.setStudentDTOList(studentDTOFullList);


    }

    @Test
    void shouldBeNull() {
        assertNull(ObjectMapper.<Integer>map(null, Integer.class));
    }

    @Test
    void shouldConvertModelToDTO() {

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

        StudentDTOFull studentDTOFull = ObjectMapper.map(student, StudentDTOFull.class);

        assertEquals(id, studentDTOFull.getId());
        assertEquals(name, studentDTOFull.getName());
        assertEquals(email, studentDTOFull.getEmail());
        assertEquals(password, studentDTOFull.getPassword());
        assertEquals(birthday, studentDTOFull.getBirthday());
        assertEquals(courseId, studentDTOFull.getCourseId());
        assertEquals(courseDTO, studentDTOFull.getCourseDTO());

        assertEquals(ObjectMapperTest.studentDTOFull, studentDTOFull);
    }

    @Test
    void shouldConvertCourseWithListToCourseWithListDTO() {

        CourseWitListDTO courseWitListDTO = ObjectMapper.map(courseWithList, CourseWitListDTO.class);

        assertEquals(courseId, courseWitListDTO.getId());
        assertEquals(courseName, courseWitListDTO.getName());

        List<StudentDTOFull> studentDTOList1 = courseWitListDTO.getStudentDTOList();

        assertEquals(studentDTOFullList, studentDTOList1);
    }

    @Test
    void shouldConvertCourseWithSetToCourseWithSetDTO() {

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);
        studentSet.add(student1);

        Set<StudentDTO> studentDTOSet = new HashSet<>();
        studentDTOSet.add(studentDTO);
        studentDTOSet.add(studentDTO1);

        CourseWithSet courseWithSet = new CourseWithSet();
        courseWithSet.setId(courseId);
        courseWithSet.setName(courseName);
        courseWithSet.setStudentSet(studentSet);

        CourseWithSetDTO courseWithSetDTO = new CourseWithSetDTO();
        courseWithSetDTO.setId(courseId);
        courseWithSetDTO.setName(courseName);
        courseWithSetDTO.setStudentDTOSet(studentDTOSet);

        CourseWithSetDTO courseWithSetDTO1 = ObjectMapper.map(courseWithSet, CourseWithSetDTO.class);

        assertEquals(studentDTOSet, courseWithSetDTO1.getStudentDTOSet());
    }

    @Test
    void shouldConvertCourseWithSetDTOToCourseWithSet() {

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(studentWithoutCourse);
        studentSet.add(studentWithoutCourse1);

        Set<StudentDTO> studentDTOSet = new HashSet<>();
        studentDTOSet.add(studentDTO);
        studentDTOSet.add(studentDTO1);

        CourseWithSet courseWithSet = new CourseWithSet();
        courseWithSet.setId(courseId);
        courseWithSet.setName(courseName);
        courseWithSet.setStudentSet(studentSet);

        CourseWithSetDTO courseWithSetDTO = new CourseWithSetDTO();
        courseWithSetDTO.setId(courseId);
        courseWithSetDTO.setName(courseName);
        courseWithSetDTO.setStudentDTOSet(studentDTOSet);

        CourseWithSet courseWithSet1 = ObjectMapper.map(courseWithSetDTO, CourseWithSet.class);

        assertEquals(studentSet, courseWithSet1.getStudentSet());
    }

    @Test
    void shouldConvertCourseWithMapDTOToCourseWithMap() {

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put(studentWithoutCourse.getName(), studentWithoutCourse);
        studentMap.put(studentWithoutCourse1.getName(), studentWithoutCourse1);

        Map<String, StudentDTO> studentDTOMap = new HashMap<>();
        studentDTOMap.put(studentDTO.getName(), studentDTO);
        studentDTOMap.put(studentDTO1.getName(), studentDTO1);

        CourseWithMap courseWithMap = new CourseWithMap();
        courseWithMap.setId(courseId);
        courseWithMap.setName(courseName);
        courseWithMap.setStudentMap(studentMap);

        CourseWithMapDTO courseWithMapDTO = new CourseWithMapDTO();
        courseWithMapDTO.setId(courseId);
        courseWithMapDTO.setName(courseName);
        courseWithMapDTO.setStudentDTOMap(studentDTOMap);

        CourseWithMap courseWithMap1 = ObjectMapper.map(courseWithMapDTO, CourseWithMap.class);

        assertEquals(studentMap, courseWithMap1.getStudentMap());
    }

    @Test
    void shouldConvertCourseWithMapDTOToCourseWithMapEmptyMap() {

        Map<String, Student> studentMap = new HashMap<>();

        Map<String, StudentDTO> studentDTOMap = new HashMap<>();

        CourseWithMap courseWithMap = new CourseWithMap();
        courseWithMap.setId(courseId);
        courseWithMap.setName(courseName);
        courseWithMap.setStudentMap(studentMap);

        CourseWithMapDTO courseWithMapDTO = new CourseWithMapDTO();
        courseWithMapDTO.setId(courseId);
        courseWithMapDTO.setName(courseName);
        courseWithMapDTO.setStudentDTOMap(studentDTOMap);

        CourseWithMap courseWithMap1 = ObjectMapper.map(courseWithMapDTO, CourseWithMap.class);

        assertEquals(studentMap, courseWithMap1.getStudentMap());
    }

    @Test
    void shouldConvertListCourseWithListToListCourseWitListDTO() {

        List<CourseWithList> courseWithListArrayList = new ArrayList<>();
        courseWithListArrayList.add(courseWithList);
        courseWithListArrayList.add(courseWithList1);

        List<CourseWitListDTO> courseWitListDTOList = new ArrayList<>();
        courseWitListDTOList.add(courseWitListDTO);
        courseWitListDTOList.add(courseWitListDTO1);

        List<CourseWitListDTO> courseWitListDTOList1 = ObjectMapper.map(courseWithListArrayList, CourseWitListDTO.class);

        assertEquals(courseWitListDTOList, courseWitListDTOList1);
    }

    @Test
    void shouldConvertListCourseWitListDTOToListCourseWitList() {

        List<CourseWithList> courseWithListArrayList = new ArrayList<>();
        courseWithListArrayList.add(courseWithList);
        courseWithListArrayList.add(courseWithList1);

        List<CourseWitListDTO> courseWitListDTOList = new ArrayList<>();
        courseWitListDTOList.add(courseWitListDTO);
        courseWitListDTOList.add(courseWitListDTO1);

        List<CourseWithList> courseWithListList = ObjectMapper.map(courseWitListDTOList, CourseWithList.class);

        assertEquals(courseWithListArrayList, courseWithListList);
    }

    @Test
    void performanceTest() {

        long start = System.nanoTime();
        int repeat = 1_000_000;

        for (int i = 0; i < repeat; i++) {

            int id = new Random().nextInt();
            String name = ObjectMapperTest.name + new Random().nextInt();
            String email = ObjectMapperTest.email + new Random().nextInt();
            String password = ObjectMapperTest.password + new Random().nextInt();
            LocalDate birthday = ObjectMapperTest.birthday.minusDays(new Random().nextInt());
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
            String name = ObjectMapperTest.name + new Random().nextInt();
            String email = ObjectMapperTest.email + new Random().nextInt();
            String password = ObjectMapperTest.password + new Random().nextInt();
            LocalDate birthday = ObjectMapperTest.birthday.minusDays(new Random().nextInt());
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