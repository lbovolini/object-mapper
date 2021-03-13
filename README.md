# ObjectMapper

![CI](https://github.com/lbovolini/object-mapper/workflows/CI/badge.svg) [![Coverage Status](https://coveralls.io/repos/github/lbovolini/object-mapper/badge.svg?branch=master)](https://coveralls.io/github/lbovolini/object-mapper?branch=master) [![Maven Central](https://img.shields.io/maven-central/v/com.github.lbovolini/object-mapper.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.lbovolini%22%20AND%20a:%22object-mapper%22) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Maps an object to another via getters and setters methods

## Features

- Maps DTO to Model/Entity object
- Maps Model/Entity to DTO object
- Maps nested objects
- Maps nested Lists, Sets and Maps
- Can map any object to any object if it follows the restrictions
- Caches objects getters and setters methods for improve performance

## Restrictions

- Maps only corresponding origin object field if it has getter method and destination object have corresponding setter method
- Returned class should have accessible constructor without parameters
- Getter and setter methods name should have more than 3 characters

## Requirements

- Java 1.7+

## Examples

```java
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private LocalDate birthday;
    @Column(name = "Curso_id")
    private int courseId;

    @ManyToOne
    @JoinColumn(name = "Curso_id", insertable = false, updatable = false)
    private Course course;

    // getters, setters, equals, hashCode
}
```

```java
public class StudentDTO {

    private int id;
    private String name;
    private String email;
    private String password;
    private LocalDate birthday;
    private int courseId;

    // getters, setters, equals, hashCode
}
```

### 1. Maps DTO to Model

```java
    StudentDTO studentDTO = new StudentDTO();
    studentDTO.setId(id);
    studentDTO.setName(name);
    studentDTO.setEmail(email);
    studentDTO.setPassword(password);
    studentDTO.setBirthday(birthday);
    studentDTO.setCourseId(courseId);

    Student student = ObjectMapper.map(studentDTO, Student.class);
```

### 2. Maps Model to DTO

```java
    Student student = new Student();
    student.setId(id);
    student.setName(name);
    student.setEmail(email);
    student.setPassword(password);
    student.setBirthday(birthday);
    student.setCourseId(courseId);

    StudentDTO studentDTO = ObjectMapper.map(student, StudentDTO.class);
```

### 3. Maps List, Set and Map

```java
    List<Discipline> disciplineList = execute(query, parameters);
    List<DisciplineDTO> disciplineDTOList = ObjectMapper.map(disciplineList, DisciplineDTO.class)

```