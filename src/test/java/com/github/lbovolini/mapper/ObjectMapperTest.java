package com.github.lbovolini.mapper;

import com.github.lbovolini.dto.*;
import com.github.lbovolini.model.*;
import com.github.lbovolini.object.AnotherInvalidGetSet;
import com.github.lbovolini.object.InvalidDTOGetSet;
import com.github.lbovolini.object.InvalidGetSet;
import com.github.lbovolini.object.ObjectBool;
import com.github.lbovolini.primitive.PrimitiveBool;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ObjectMapperTest {

    private final int firstStudentId = 1;
    private final String firstStudentName = "Lucas Bovolini";
    private final String firstStudentEmail = "lbovolini94@gmail.com";
    private final String firstStudentPassword = "password123";
    private final int firstStudentCourseId = 1;
    private final String firstStudentCourseName = "Sistemas de Informação";

    private final int secondStudentId = 2;
    private final String secondStudentName = "Ana da Silva";
    private final String secondStudentEmail = "anasilva@hotmail.com.br";
    private final String secondStudentPassword = "anasilva1999";
    private final int secondStudentCourseId = 2;
    private final String secondStudentCourseName = "Matemática";

    private final Course firstStudentCourse = new Course(firstStudentCourseId, firstStudentCourseName);
    private final Student firstStudent = new Student(firstStudentId, firstStudentName, firstStudentEmail, firstStudentPassword, firstStudentCourseId, firstStudentCourse);

    private final Course secondStudentCourse = new Course(secondStudentCourseId, secondStudentCourseName);
    private final Student secondStudent = new Student(secondStudentId, secondStudentName, secondStudentEmail, secondStudentPassword, secondStudentCourseId, secondStudentCourse);

    private final Student firstStudentWithoutCourse = new Student(firstStudentId, firstStudentName, firstStudentEmail, firstStudentPassword, firstStudentCourseId);
    private final Student secondStudentWithoutCourse = new Student(secondStudentId, secondStudentName, secondStudentEmail, secondStudentPassword, secondStudentCourseId);

    private final StudentDTO firstStudentDTO = new StudentDTO(firstStudentId, firstStudentName, firstStudentEmail, firstStudentPassword, firstStudentCourseId);
    private final StudentDTO secondStudentDTO = new StudentDTO(secondStudentId, secondStudentName, secondStudentEmail, secondStudentPassword, secondStudentCourseId);

    private final CourseDTO firstStudentCourseDTO = new CourseDTO(firstStudentCourseId, firstStudentCourseName);
    private final CourseDTO secondStudentCourseDTO = new CourseDTO(secondStudentCourseId, secondStudentCourseName);

    private final StudentDTOFull firstStudentDTOFull = new StudentDTOFull(firstStudentDTO, firstStudentCourseDTO);
    private final StudentDTOFull secondStudentDTOFull = new StudentDTOFull(secondStudentDTO, secondStudentCourseDTO);

    private final StudentStringDTO firstStudentStringDTO = new StudentStringDTO(String.valueOf(firstStudentId), firstStudentName, firstStudentEmail, firstStudentPassword, String.valueOf(firstStudentCourseId));


    private final List<Student> studentList = Arrays.asList(firstStudent, secondStudent);

    private final List<StudentDTOFull> studentDTOFullList = Arrays.asList(firstStudentDTOFull, secondStudentDTOFull);

    private final CourseWithList firstCourseWithList = new CourseWithList(firstStudentCourse, studentList);
    private final CourseWithList secondCourseWithList = new CourseWithList(secondStudentCourse, studentList);

    private final CourseWitListDTO firstCourseWitListDTO = new CourseWitListDTO(firstStudentCourseDTO, studentDTOFullList);
    private final CourseWitListDTO secondCourseWithListDTO = new CourseWitListDTO(secondStudentCourseDTO, studentDTOFullList);


    @Test
    void shouldBeNull() {
        assertNull(ObjectMapper.map(null, Integer.class));
    }

    @Test
    void shouldThrowExceptionWhenObjectIsNotNullAndClassIsNull() {

        String message = "";
        try {
            ObjectMapper.map(new Object(), null);
        } catch (IllegalArgumentException e) {
            message = e.getMessage();
        } finally {
            assertEquals(message, "Class cannot be null");
        }
    }

    @Test
    void shouldThrowExceptionWhenClassDoesNotHaveAccessibleNonParametrizedConstructor() {

        class PrimitiveInt {
            private int i;

            public int getI() {
                return i;
            }

            public void setI(int i) {
                this.i = i;
            }
        }

        class ObjectInt {
            private Integer i;

            public Integer getI() {
                return i;
            }

            public void setI(Integer i) {
                this.i = i;
            }
        }

        // Input
        PrimitiveInt primitiveInt = new PrimitiveInt();

        String message = "";
        try {
            // Should test ONLY this method
            ObjectMapper.map(primitiveInt, ObjectInt.class);
        } catch (RuntimeException e) {
            message = e.getMessage();
        } finally {
            // Assertions
            assertEquals("Error while creating instance of given class. Maybe it does not have accessible non parametrized constructor", message);
        }
    }

    @Test
    void shouldNotWorkWithUnnamedGetOrSet() {
        // Input
        InvalidGetSet invalidGetSet = new InvalidGetSet();
        invalidGetSet.set(1);

        // Should test ONLY this method
        AnotherInvalidGetSet anotherInvalidGetSet = ObjectMapper.map(invalidGetSet, AnotherInvalidGetSet.class);

        // Assertions
        assertEquals(0, anotherInvalidGetSet.get());
    }

    @Test
    void shouldWorkWithGetSetDtoMethodName() {
        // Input
        InvalidGetSet invalidGetSet = new InvalidGetSet();
        invalidGetSet.setDto(1);

        // Should test ONLY this method
        InvalidDTOGetSet invalidDTOGetSet = ObjectMapper.map(invalidGetSet, InvalidDTOGetSet.class);

        // Assertions
        assertEquals(1, invalidDTOGetSet.getDto());
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
        // Should test ONLY this method
        StudentEmptyDTO studentEmptyDTO = ObjectMapper.map(firstStudent, StudentEmptyDTO.class);

        // Assertions
        assertNotNull(studentEmptyDTO);
    }

    @Test
    void shouldConvertStudentEmptyDTOToStudent() {
        // Input
        StudentEmptyDTO studentEmptyDTO = new StudentEmptyDTO();

        // Expected output
        Student expectedOutput = new Student();

        // Should test ONLY this method
        Student student = ObjectMapper.map(studentEmptyDTO, Student.class);

        // Assertions
        assertEquals(expectedOutput, student);
    }

    @Test
    void shouldConvertModelToDTO() {
        // Should test ONLY this method
        StudentDTO studentDTO = ObjectMapper.map(firstStudent, StudentDTO.class);

        // Assertions
        assertEquals(studentDTO, studentDTO);
    }

    @Test
    void shouldConvertDTOToModel() {
        // Should test ONLY this method
        Student student = ObjectMapper.map(firstStudentDTO, Student.class);

        // Assertions
        assertEquals(firstStudentWithoutCourse, student);
    }

    @Test
    void shouldConvertStudentDTOFullToStudent() {
        // Should test ONLY this method
        Student student = ObjectMapper.map(firstStudentDTOFull, Student.class);

        // Assertions
        assertEquals(firstStudent, student);
    }

    @Test
    void shouldConvertStudentToStudentDTOFull() {
        // Should test ONLY this method
        StudentDTOFull studentDTOFull = ObjectMapper.map(firstStudent, StudentDTOFull.class);

        // Assertions
        assertEquals(firstStudentDTOFull, studentDTOFull);
    }

    @Test
    void shouldConvertStudentToStudentStringDTO() {
        // Should test ONLY this method
        StudentStringDTO studentStringDTO = ObjectMapper.map(firstStudent, StudentStringDTO.class);

        // Assertions
        assertEquals(firstStudentStringDTO, studentStringDTO);
    }

    @Test
    void shouldConvertStudentStringDTOToStudent() {
        // Should test ONLY this method
        Student student = ObjectMapper.map(firstStudentStringDTO, Student.class);

        // Assertions
        assertEquals(firstStudentWithoutCourse, student);
    }

    @Test
    void shouldConvertCourseWithListToCourseWithListDTO() {
        // Should test ONLY this method
        CourseWitListDTO courseWitListDTO = ObjectMapper.map(firstCourseWithList, CourseWitListDTO.class);

        // Assertions
        assertEquals(firstCourseWitListDTO, courseWitListDTO);
    }

    @Test
    void shouldConvertCourseWithSetToCourseWithSetDTO() {
        // Inputs
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(firstStudent);
        studentSet.add(secondStudent);

        CourseWithSet courseWithSet = new CourseWithSet();
        courseWithSet.setId(firstStudentCourseId);
        courseWithSet.setName(firstStudentCourseName);
        courseWithSet.setStudentSet(studentSet);

        // Expected output
        Set<StudentDTO> studentDTOSet = new HashSet<>();
        studentDTOSet.add(firstStudentDTO);
        studentDTOSet.add(secondStudentDTO);

        CourseWithSetDTO expectedOutput = new CourseWithSetDTO();
        expectedOutput.setId(firstStudentCourseId);
        expectedOutput.setName(firstStudentCourseName);
        expectedOutput.setStudentDTOSet(studentDTOSet);

        // Should test ONLY this method
        CourseWithSetDTO courseWithSetDTO = ObjectMapper.map(courseWithSet, CourseWithSetDTO.class);

        // Assertions
        assertEquals(expectedOutput, courseWithSetDTO);
    }

    @Test
    void shouldConvertCourseWithSetDTOToCourseWithSet() {
        // Input
        Set<StudentDTO> studentDTOSet = new HashSet<>();
        studentDTOSet.add(firstStudentDTO);
        studentDTOSet.add(secondStudentDTO);

        CourseWithSetDTO courseWithSetDTO = new CourseWithSetDTO();
        courseWithSetDTO.setId(firstStudentCourseId);
        courseWithSetDTO.setName(firstStudentCourseName);
        courseWithSetDTO.setStudentDTOSet(studentDTOSet);

        // Expected output
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(firstStudentWithoutCourse);
        studentSet.add(secondStudentWithoutCourse);

        CourseWithSet expectedOutput = new CourseWithSet();
        expectedOutput.setId(firstStudentCourseId);
        expectedOutput.setName(firstStudentCourseName);
        expectedOutput.setStudentSet(studentSet);

        // Should test ONLY this method
        CourseWithSet courseWithSet = ObjectMapper.map(courseWithSetDTO, CourseWithSet.class);

        // Assertions
        assertEquals(expectedOutput, courseWithSet);
    }

    @Test
    void shouldConvertCourseWithMapDTOToCourseWithMap() {
        // Input
        Map<String, StudentDTO> studentDTOMap = new HashMap<>();
        studentDTOMap.put(firstStudentDTO.getName(), firstStudentDTO);
        studentDTOMap.put(secondStudentDTO.getName(), secondStudentDTO);

        CourseWithMapDTO courseWithMapDTO = new CourseWithMapDTO();
        courseWithMapDTO.setId(firstStudentCourseId);
        courseWithMapDTO.setName(firstStudentCourseName);
        courseWithMapDTO.setStudentDTOMap(studentDTOMap);

        // Expected output
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put(firstStudentWithoutCourse.getName(), firstStudentWithoutCourse);
        studentMap.put(secondStudentWithoutCourse.getName(), secondStudentWithoutCourse);

        CourseWithMap expectedOutput = new CourseWithMap();
        expectedOutput.setId(firstStudentCourseId);
        expectedOutput.setName(firstStudentCourseName);
        expectedOutput.setStudentMap(studentMap);

        // Should test ONLY this method
        CourseWithMap courseWithMap = ObjectMapper.map(courseWithMapDTO, CourseWithMap.class);

        // Assertions
        assertEquals(expectedOutput, courseWithMap);
    }

    @Test
    void shouldConvertCourseWithMapDTOToCourseWithMapEmptyMap() {
        // Input
        Map<String, StudentDTO> studentDTOMap = new HashMap<>();

        CourseWithMapDTO courseWithMapDTO = new CourseWithMapDTO();
        courseWithMapDTO.setId(firstStudentCourseId);
        courseWithMapDTO.setName(firstStudentCourseName);
        courseWithMapDTO.setStudentDTOMap(studentDTOMap);

        // Expected output
        Map<String, Student> studentMap = new HashMap<>();

        CourseWithMap expectedOutput = new CourseWithMap();
        expectedOutput.setId(firstStudentCourseId);
        expectedOutput.setName(firstStudentCourseName);
        expectedOutput.setStudentMap(studentMap);

        // Should test ONLY this method
        CourseWithMap courseWithMap = ObjectMapper.map(courseWithMapDTO, CourseWithMap.class);

        // Assertions
        assertEquals(expectedOutput, courseWithMap);
    }

    @Test
    void shouldConvertListCourseWithListToListCourseWitListDTO() {
        // Input
        List<CourseWithList> courseWithListArrayList = new ArrayList<>();
        courseWithListArrayList.add(firstCourseWithList);
        courseWithListArrayList.add(secondCourseWithList);

        // Expected output
        List<CourseWitListDTO> expectedOutput = new ArrayList<>();
        expectedOutput.add(firstCourseWitListDTO);
        expectedOutput.add(secondCourseWithListDTO);

        // Should test ONLY this method
        List<CourseWitListDTO> courseWitListDTOList = ObjectMapper.map(courseWithListArrayList, CourseWitListDTO.class);

        // Assertions
        assertEquals(expectedOutput, courseWitListDTOList);
    }

    @Test
    void shouldConvertListCourseWitListDTOToListCourseWitList() {
        // Input
        List<CourseWitListDTO> courseWitListDTOList = new ArrayList<>();
        courseWitListDTOList.add(firstCourseWitListDTO);
        courseWitListDTOList.add(secondCourseWithListDTO);

        // Expected output
        List<CourseWithList> expectedOutput = new ArrayList<>();
        expectedOutput.add(firstCourseWithList);
        expectedOutput.add(secondCourseWithList);

        // Should test ONLY this method
        List<CourseWithList> courseWithListList = ObjectMapper.map(courseWitListDTOList, CourseWithList.class);

        // Assertions
        assertEquals(expectedOutput, courseWithListList);
    }

    /**
     * Infinite recursion test case
     */
    @Test
    void shouldConvertListCourseWithListWithStudentWithSelfToListCourseWithListWithStudentWithSelfDTO() {
        // Input
        CourseWithListWithStudentWithSelf courseWithListWithStudentWithSelf = new CourseWithListWithStudentWithSelf();
        CourseWithListWithStudentWithSelf courseWithListWithStudentWithSelf1 = new CourseWithListWithStudentWithSelf();
        StudentWithCourseWithListWithSelf studentWithCourseWithListWithSelf = new StudentWithCourseWithListWithSelf(firstStudentId, firstStudentName, firstStudentEmail, firstStudentPassword, firstStudentCourseId, courseWithListWithStudentWithSelf);
        StudentWithCourseWithListWithSelf studentWithCourseWithListWithSelf1 = new StudentWithCourseWithListWithSelf(secondStudentId, secondStudentName, secondStudentEmail, secondStudentPassword, secondStudentCourseId, courseWithListWithStudentWithSelf1);

        List<StudentWithCourseWithListWithSelf> studentWithCourseWithListWithSelfList = new ArrayList<>();
        studentWithCourseWithListWithSelfList.add(studentWithCourseWithListWithSelf);
        studentWithCourseWithListWithSelfList.add(studentWithCourseWithListWithSelf1);


        courseWithListWithStudentWithSelf.setId(firstStudentCourseId);
        courseWithListWithStudentWithSelf.setName(firstStudentCourseName);
        courseWithListWithStudentWithSelf.setStudentWithCourseWithListWithSelfList(studentWithCourseWithListWithSelfList);

        courseWithListWithStudentWithSelf1.setId(secondStudentCourseId);
        courseWithListWithStudentWithSelf1.setName(secondStudentCourseName);
        courseWithListWithStudentWithSelf1.setStudentWithCourseWithListWithSelfList(studentWithCourseWithListWithSelfList);

        List<CourseWithListWithStudentWithSelf> courseWithListWithStudentWithSelfList = new ArrayList<>();
        courseWithListWithStudentWithSelfList.add(courseWithListWithStudentWithSelf);
        courseWithListWithStudentWithSelfList.add(courseWithListWithStudentWithSelf1);

        List<StudentWithCourseWithListWithSelfDTO> studentWithCourseWithListWithSelfDTOList = new ArrayList<>();

        CourseWithListWithStudentWithSelfDTO courseWithListWithStudentWithSelfDTO = new CourseWithListWithStudentWithSelfDTO(firstStudentCourseDTO, studentWithCourseWithListWithSelfDTOList);
        CourseWithListWithStudentWithSelfDTO courseWithListWithStudentWithSelfDTO1 = new CourseWithListWithStudentWithSelfDTO(secondStudentCourseDTO, studentWithCourseWithListWithSelfDTOList);
        StudentWithCourseWithListWithSelfDTO studentWithCourseWithListWithSelfDTO = new StudentWithCourseWithListWithSelfDTO(firstStudentDTO, courseWithListWithStudentWithSelfDTO);
        StudentWithCourseWithListWithSelfDTO studentWithCourseWithListWithSelfDTO1 = new StudentWithCourseWithListWithSelfDTO(secondStudentDTO, courseWithListWithStudentWithSelfDTO1);

        studentWithCourseWithListWithSelfDTOList.add(studentWithCourseWithListWithSelfDTO);
        studentWithCourseWithListWithSelfDTOList.add(studentWithCourseWithListWithSelfDTO1);

        // Expected output
        List<CourseWithListWithStudentWithSelfDTO> expectedOutput = new ArrayList<>();
        expectedOutput.add(courseWithListWithStudentWithSelfDTO);
        expectedOutput.add(courseWithListWithStudentWithSelfDTO1);

        // Should test ONLY this method
        List<CourseWithListWithStudentWithSelfDTO> courseWithListWithStudentWithSelfDTOList1 = ObjectMapper.map(courseWithListWithStudentWithSelfList, CourseWithListWithStudentWithSelfDTO.class);

        // Assertions
        assertNull(courseWithListWithStudentWithSelfDTOList1.get(0).getStudentWithCourseWithListWithSelfDTOList().get(0).getCourseWithListWithStudentWithSelfDTO());
        assertNull(courseWithListWithStudentWithSelfDTOList1.get(0).getStudentWithCourseWithListWithSelfDTOList().get(1).getCourseWithListWithStudentWithSelfDTO());
        assertNull(courseWithListWithStudentWithSelfDTOList1.get(1).getStudentWithCourseWithListWithSelfDTOList().get(0).getCourseWithListWithStudentWithSelfDTO());
        assertNull(courseWithListWithStudentWithSelfDTOList1.get(1).getStudentWithCourseWithListWithSelfDTOList().get(1).getCourseWithListWithStudentWithSelfDTO());

        assertEquals(courseWithListWithStudentWithSelfDTOList1.get(0), courseWithListWithStudentWithSelfDTO);
        assertEquals(courseWithListWithStudentWithSelfDTOList1.get(1), courseWithListWithStudentWithSelfDTO1);
        assertEquals(expectedOutput, courseWithListWithStudentWithSelfDTOList1);
    }

    @Test
    void performanceTest() {

        long start = System.nanoTime();
        int repeat = 1_000_000;

        for (int i = 0; i < repeat; i++) {

            int id = new Random().nextInt();
            String name = firstStudentName + new Random().nextInt();
            String email = firstStudentEmail + new Random().nextInt();
            String password = firstStudentPassword + new Random().nextInt();
            int courseId = new Random().nextInt();

            Student student = new Student(id, name, email, password, courseId);

            StudentDTO studentDTO = ObjectMapper.map(student, StudentDTO.class);

            assertEquals(id, studentDTO.getId());
            assertEquals(name, studentDTO.getName());
            assertEquals(email, studentDTO.getEmail());
            assertEquals(password, studentDTO.getPassword());
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
            String name = firstStudentName + new Random().nextInt();
            String email = firstStudentEmail + new Random().nextInt();
            String password = firstStudentPassword + new Random().nextInt();
            int courseId = new Random().nextInt();

            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setEmail(email);
            student.setPassword(password);
            student.setCourseId(courseId);

            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setId(student.getId());
            studentDTO.setName(student.getName());
            studentDTO.setEmail(student.getEmail());
            studentDTO.setPassword(student.getPassword());
            studentDTO.setCourseId(student.getCourseId());

            assertEquals(id, studentDTO.getId());
            assertEquals(name, studentDTO.getName());
            assertEquals(email, studentDTO.getEmail());
            assertEquals(password, studentDTO.getPassword());
            assertEquals(courseId, studentDTO.getCourseId());
        }

        long end = System.nanoTime();

        System.out.println((end - start) / 1_000_000_000.0);
    }

}