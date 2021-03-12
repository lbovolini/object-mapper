package com.github.lbovolini.mapper;

import com.github.lbovolini.dto.*;
import com.github.lbovolini.model.*;
import com.github.lbovolini.object.ObjectBool;
import com.github.lbovolini.primitive.PrimitiveBool;
import org.junit.jupiter.api.Test;

//import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ObjectMapperTest {

    private static final int id = 1;
    private static final String name = "Lucas Bovolini";
    private static final String email = "lucasbovolini@hotmail.com";
    private static final String password = "password123";
    //private static final LocalDate birthday = LocalDate.of(1994, 7, 18);
    private static final int courseId = 1;
    private static final String courseName = "Sistemas de Informação";

    private static final int randId = new Random().nextInt();
    private static final String randName = name + new Random().nextInt();
    private static final String randEmail = email + new Random().nextInt();
    private static final String randPassword = password + new Random().nextInt();
    //private static final LocalDate randBirthday = birthday.minusDays(new Random().nextInt());
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
        //student.setBirthday(birthday);
        student.setCourseId(courseId);
        student.setCourse(course);

        student1.setId(randId);
        student1.setName(randName);
        student1.setEmail(randEmail);
        student1.setPassword(randPassword);
        //student1.setBirthday(randBirthday);
        student1.setCourseId(randCourseId);
        student1.setCourse(course);

        studentWithoutCourse.setId(id);
        studentWithoutCourse.setName(name);
        studentWithoutCourse.setEmail(email);
        studentWithoutCourse.setPassword(password);
        //studentWithoutCourse.setBirthday(birthday);
        studentWithoutCourse.setCourseId(courseId);

        studentWithoutCourse1.setId(randId);
        studentWithoutCourse1.setName(randName);
        studentWithoutCourse1.setEmail(randEmail);
        studentWithoutCourse1.setPassword(randPassword);
        //studentWithoutCourse1.setBirthday(randBirthday);
        studentWithoutCourse1.setCourseId(randCourseId);

        studentDTO.setId(id);
        studentDTO.setName(name);
        studentDTO.setEmail(email);
        studentDTO.setPassword(password);
        //studentDTO.setBirthday(birthday);
        studentDTO.setCourseId(courseId);

        studentDTO1.setId(randId);
        studentDTO1.setName(randName);
        studentDTO1.setEmail(randEmail);
        studentDTO1.setPassword(randPassword);
        //studentDTO1.setBirthday(randBirthday);
        studentDTO1.setCourseId(randCourseId);

        course.setId(courseId);
        course.setName(courseName);

        courseDTO.setId(courseId);
        courseDTO.setName(courseName);

        studentDTOFull.setId(id);
        studentDTOFull.setName(name);
        studentDTOFull.setEmail(email);
        studentDTOFull.setPassword(password);
        //studentDTOFull.setBirthday(birthday);
        studentDTOFull.setCourseId(courseId);
        studentDTOFull.setCourseDTO(courseDTO);

        studentDTOFull1.setId(randId);
        studentDTOFull1.setName(randName);
        studentDTOFull1.setEmail(randEmail);
        studentDTOFull1.setPassword(randPassword);
        //studentDTOFull1.setBirthday(randBirthday);
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
    void shouldConvertPrimitiveTypeToBoxed() {
        PrimitiveTypeDTO primitiveTypeDTO = new PrimitiveTypeDTO(false, (byte) 1, 'A', (short) 2, 3, 4.4f, 5.5d, 6L);
        BoxedPrimitiveType expectedOutput = new BoxedPrimitiveType(false, (byte) 1, 'A', (short) 2, 3, 4.4f, 5.5d, 6L);

        BoxedPrimitiveType boxedPrimitiveType = ObjectMapper.map(primitiveTypeDTO, BoxedPrimitiveType.class);

        assertEquals(expectedOutput, boxedPrimitiveType);
    }

    @Test
    void shouldConvertBoxedTypeToPrimitive() {
        BoxedPrimitiveType boxedPrimitiveType = new BoxedPrimitiveType(false, (byte) 1, 'A', (short) 2, 3, 4.4f, 5.5d, 6L);
        PrimitiveTypeDTO expectedOutput = new PrimitiveTypeDTO(false, (byte) 1, 'A', (short) 2, 3, 4.4f, 5.5d, 6L);

        PrimitiveTypeDTO primitiveTypeDTO = ObjectMapper.map(boxedPrimitiveType, PrimitiveTypeDTO.class);

        assertEquals(expectedOutput, primitiveTypeDTO);
    }

    @Test
    void shouldConvertUninitialisedPrimitiveTypeToBoxed() {
        PrimitiveTypeDTO primitiveTypeDTO = new PrimitiveTypeDTO();
        BoxedPrimitiveType expectedOutput = new BoxedPrimitiveType(false, (byte) 0, '\u0000', (short) 0, 0, 0.0f, 0.0d, 0L);

        BoxedPrimitiveType boxedPrimitiveType = ObjectMapper.map(primitiveTypeDTO, BoxedPrimitiveType.class);

        assertEquals(expectedOutput, boxedPrimitiveType);
    }

    @Test
    void shouldConvertUninitialisedBoxedTypeToPrimitive() {
        BoxedPrimitiveType boxedPrimitiveType = new BoxedPrimitiveType();
        PrimitiveTypeDTO expectedOutput = new PrimitiveTypeDTO();

        PrimitiveTypeDTO primitiveTypeDTO = ObjectMapper.map(boxedPrimitiveType, PrimitiveTypeDTO.class);

        assertEquals(expectedOutput, primitiveTypeDTO);
    }

    @Test
    void shouldConvertNullBooleanObjectToPrimitive() {
        ObjectBool objectBool = new ObjectBool(null);
        PrimitiveBool expectedPrimitiveOutput = new PrimitiveBool();

        assertEquals(expectedPrimitiveOutput, ObjectMapper.map(objectBool, PrimitiveBool.class));
    }

    @Test
    void shouldConvertStudentToStudentEmptyDTO() {
        StudentEmptyDTO studentEmptyDTO1 = ObjectMapper.map(student, StudentEmptyDTO.class);
    }

    @Test
    void shouldConvertStudentEmptyDTOToStudent() {
        StudentEmptyDTO studentEmptyDTO = new StudentEmptyDTO();
        Student student = ObjectMapper.map(studentEmptyDTO, Student.class);
    }

    @Test
    void shouldConvertModelToDTO() {

        StudentDTO studentDTO = ObjectMapper.map(student, StudentDTO.class);

        assertEquals(id, studentDTO.getId());
        assertEquals(name, studentDTO.getName());
        assertEquals(email, studentDTO.getEmail());
        assertEquals(password, studentDTO.getPassword());
        //assertEquals(birthday, studentDTO.getBirthday());
        assertEquals(courseId, studentDTO.getCourseId());
    }

    @Test
    void shouldConvertDTOToModel() {

        Student student = ObjectMapper.map(studentDTO, Student.class);

        assertEquals(id, student.getId());
        assertEquals(name, student.getName());
        assertEquals(email, student.getEmail());
        assertEquals(password, student.getPassword());
        //assertEquals(birthday, student.getBirthday());
        assertEquals(courseId, student.getCourseId());
    }

    @Test
    void shouldConvertStudentDTOFullToStudent() {

        Student student = ObjectMapper.map(studentDTOFull, Student.class);

        assertEquals(id, student.getId());
        assertEquals(name, student.getName());
        assertEquals(email, student.getEmail());
        assertEquals(password, student.getPassword());
        //assertEquals(birthday, student.getBirthday());
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
        //assertEquals(birthday, studentDTOFull.getBirthday());
        assertEquals(courseId, studentDTOFull.getCourseId());
        assertEquals(courseDTO, studentDTOFull.getCourseDTO());

        assertEquals(ObjectMapperTest.studentDTOFull, studentDTOFull);
    }

    @Test
    void shouldConvertStudentToStudentStringDTO() {

        StudentStringDTO studentStringDTO = new StudentStringDTO();
        studentStringDTO.setId(String.valueOf(id));
        studentStringDTO.setName(name);
        studentStringDTO.setEmail(email);
        studentStringDTO.setPassword(password);
        studentStringDTO.setCourseId(String.valueOf(courseId));

        StudentStringDTO studentStringDTO1 = ObjectMapper.map(student, StudentStringDTO.class);

        assertEquals(studentStringDTO, studentStringDTO1);
    }

    @Test
    void shouldConvertStudentStringDTOToStudent() {

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        student.setCourseId(courseId);

        StudentStringDTO studentStringDTO = new StudentStringDTO();
        studentStringDTO.setId(String.valueOf(id));
        studentStringDTO.setName(name);
        studentStringDTO.setEmail(email);
        studentStringDTO.setPassword(password);
        studentStringDTO.setCourseId(String.valueOf(courseId));

        Student student1 = ObjectMapper.map(studentStringDTO, Student.class);

        assertEquals(student, student1);
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
    void shouldConvertListCourseWithListWithStudentWithSelfToListCourseWithListWithStudentWithSelfDTO() {

        CourseWithListWithStudentWithSelf courseWithListWithStudentWithSelf = new CourseWithListWithStudentWithSelf();
        CourseWithListWithStudentWithSelf courseWithListWithStudentWithSelf1 = new CourseWithListWithStudentWithSelf();
        StudentWithCourseWithListWithSelf studentWithCourseWithListWithSelf = new StudentWithCourseWithListWithSelf();
        StudentWithCourseWithListWithSelf studentWithCourseWithListWithSelf1 = new StudentWithCourseWithListWithSelf();

        List<StudentWithCourseWithListWithSelf> studentWithCourseWithListWithSelfList = new ArrayList<>();
        studentWithCourseWithListWithSelfList.add(studentWithCourseWithListWithSelf);
        studentWithCourseWithListWithSelfList.add(studentWithCourseWithListWithSelf1);

        studentWithCourseWithListWithSelf.setId(id);
        studentWithCourseWithListWithSelf.setName(name);
        studentWithCourseWithListWithSelf.setEmail(email);
        studentWithCourseWithListWithSelf.setPassword(password);
        studentWithCourseWithListWithSelf.setCourseId(courseId);
        studentWithCourseWithListWithSelf.setCourseWithListWithStudentWithSelf(courseWithListWithStudentWithSelf);

        studentWithCourseWithListWithSelf1.setId(randId);
        studentWithCourseWithListWithSelf1.setName(randName);
        studentWithCourseWithListWithSelf1.setEmail(randEmail);
        studentWithCourseWithListWithSelf1.setPassword(randPassword);
        studentWithCourseWithListWithSelf1.setCourseId(randCourseId);
        studentWithCourseWithListWithSelf1.setCourseWithListWithStudentWithSelf(courseWithListWithStudentWithSelf1);

        courseWithListWithStudentWithSelf.setId(courseId);
        courseWithListWithStudentWithSelf.setName(courseName);
        courseWithListWithStudentWithSelf.setStudentWithCourseWithListWithSelfList(studentWithCourseWithListWithSelfList);

        courseWithListWithStudentWithSelf1.setId(randId);
        courseWithListWithStudentWithSelf1.setName(randName);
        courseWithListWithStudentWithSelf1.setStudentWithCourseWithListWithSelfList(studentWithCourseWithListWithSelfList);

        List<CourseWithListWithStudentWithSelf> courseWithListWithStudentWithSelfList = new ArrayList<>();
        courseWithListWithStudentWithSelfList.add(courseWithListWithStudentWithSelf);
        courseWithListWithStudentWithSelfList.add(courseWithListWithStudentWithSelf1);

        CourseWithListWithStudentWithSelfDTO courseWithListWithStudentWithSelfDTO = new CourseWithListWithStudentWithSelfDTO();
        CourseWithListWithStudentWithSelfDTO courseWithListWithStudentWithSelfDTO1 = new CourseWithListWithStudentWithSelfDTO();
        StudentWithCourseWithListWithSelfDTO studentWithCourseWithListWithSelfDTO = new StudentWithCourseWithListWithSelfDTO();
        StudentWithCourseWithListWithSelfDTO studentWithCourseWithListWithSelfDTO1 = new StudentWithCourseWithListWithSelfDTO();

        List<StudentWithCourseWithListWithSelfDTO> studentWithCourseWithListWithSelfDTOList = new ArrayList<>();
        studentWithCourseWithListWithSelfDTOList.add(studentWithCourseWithListWithSelfDTO);
        studentWithCourseWithListWithSelfDTOList.add(studentWithCourseWithListWithSelfDTO1);

        studentWithCourseWithListWithSelfDTO.setId(id);
        studentWithCourseWithListWithSelfDTO.setName(name);
        studentWithCourseWithListWithSelfDTO.setEmail(email);
        studentWithCourseWithListWithSelfDTO.setPassword(password);
        studentWithCourseWithListWithSelfDTO.setCourseId(courseId);
        studentWithCourseWithListWithSelfDTO.setCourseWithListWithStudentWithSelfDTO(courseWithListWithStudentWithSelfDTO);

        studentWithCourseWithListWithSelfDTO1.setId(randId);
        studentWithCourseWithListWithSelfDTO1.setName(randName);
        studentWithCourseWithListWithSelfDTO1.setEmail(randEmail);
        studentWithCourseWithListWithSelfDTO1.setPassword(randPassword);
        studentWithCourseWithListWithSelfDTO1.setCourseId(randCourseId);
        studentWithCourseWithListWithSelfDTO1.setCourseWithListWithStudentWithSelfDTO(courseWithListWithStudentWithSelfDTO1);

        courseWithListWithStudentWithSelfDTO.setId(courseId);
        courseWithListWithStudentWithSelfDTO.setName(courseName);
        courseWithListWithStudentWithSelfDTO.setStudentWithCourseWithListWithSelfDTOList(studentWithCourseWithListWithSelfDTOList);

        courseWithListWithStudentWithSelfDTO1.setId(randId);
        courseWithListWithStudentWithSelfDTO1.setName(randName);
        courseWithListWithStudentWithSelfDTO1.setStudentWithCourseWithListWithSelfDTOList(studentWithCourseWithListWithSelfDTOList);

        List<CourseWithListWithStudentWithSelfDTO> courseWithListWithStudentWithSelfDTOList = new ArrayList<>();
        courseWithListWithStudentWithSelfDTOList.add(courseWithListWithStudentWithSelfDTO);
        courseWithListWithStudentWithSelfDTOList.add(courseWithListWithStudentWithSelfDTO1);

        List<CourseWithListWithStudentWithSelfDTO> courseWithListWithStudentWithSelfDTOList1 = ObjectMapper.map(courseWithListWithStudentWithSelfList, CourseWithListWithStudentWithSelfDTO.class);

        assertNull(courseWithListWithStudentWithSelfDTOList1.get(0).getStudentWithCourseWithListWithSelfDTOList().get(0).getCourseWithListWithStudentWithSelfDTO());
        assertNull(courseWithListWithStudentWithSelfDTOList1.get(0).getStudentWithCourseWithListWithSelfDTOList().get(1).getCourseWithListWithStudentWithSelfDTO());
        assertNull(courseWithListWithStudentWithSelfDTOList1.get(1).getStudentWithCourseWithListWithSelfDTOList().get(0).getCourseWithListWithStudentWithSelfDTO());
        assertNull(courseWithListWithStudentWithSelfDTOList1.get(1).getStudentWithCourseWithListWithSelfDTOList().get(1).getCourseWithListWithStudentWithSelfDTO());

        assertEquals(courseWithListWithStudentWithSelfDTOList1.get(0), courseWithListWithStudentWithSelfDTO);
        assertEquals(courseWithListWithStudentWithSelfDTOList1.get(1), courseWithListWithStudentWithSelfDTO1);
        assertEquals(courseWithListWithStudentWithSelfDTOList, courseWithListWithStudentWithSelfDTOList1);
    }

    @Test
    void performanceTest() {

        long start = System.nanoTime();
        int repeat = 1_000_000;

       // for (int i = 0; i < repeat; i++) {

            int id = new Random().nextInt();
            String name = ObjectMapperTest.name + new Random().nextInt();
            String email = ObjectMapperTest.email + new Random().nextInt();
            String password = ObjectMapperTest.password + new Random().nextInt();
            //LocalDate birthday = ObjectMapperTest.birthday.minusDays(new Random().nextInt());
            int courseId = new Random().nextInt();

            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setEmail(email);
            student.setPassword(password);
            //student.setBirthday(birthday);
            student.setCourseId(courseId);

            StudentDTO studentDTO = ObjectMapper.map(student, StudentDTO.class);

            assertEquals(id, studentDTO.getId());
            assertEquals(name, studentDTO.getName());
            assertEquals(email, studentDTO.getEmail());
            assertEquals(password, studentDTO.getPassword());
            //assertEquals(birthday, studentDTO.getBirthday());
            assertEquals(courseId, studentDTO.getCourseId());
       // }

        long end = System.nanoTime();

        System.out.println((end - start) / 1_000_000_000.0);
    }

    @Test
    void performanceTest2() {

        long start = System.nanoTime();
        int repeat = 1_000_000;

       // for (int i = 0; i < repeat; i++) {

            int id = new Random().nextInt();
            String name = ObjectMapperTest.name + new Random().nextInt();
            String email = ObjectMapperTest.email + new Random().nextInt();
            String password = ObjectMapperTest.password + new Random().nextInt();
            //LocalDate birthday = ObjectMapperTest.birthday.minusDays(new Random().nextInt());
            int courseId = new Random().nextInt();

            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setEmail(email);
            student.setPassword(password);
            //student.setBirthday(birthday);
            student.setCourseId(courseId);

            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setId(student.getId());
            studentDTO.setName(student.getName());
            studentDTO.setEmail(student.getEmail());
            studentDTO.setPassword(student.getPassword());
            //studentDTO.setBirthday(student.getBirthday());
            studentDTO.setCourseId(student.getCourseId());

            assertEquals(id, studentDTO.getId());
            assertEquals(name, studentDTO.getName());
            assertEquals(email, studentDTO.getEmail());
            assertEquals(password, studentDTO.getPassword());
            //assertEquals(birthday, studentDTO.getBirthday());
            assertEquals(courseId, studentDTO.getCourseId());
        //}

        long end = System.nanoTime();

        System.out.println((end - start) / 1_000_000_000.0);
    }

}