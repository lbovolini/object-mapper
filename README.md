# ObjectMapper

Maps an object to another via getters and setters methods

## Features

- Maps DTO to Model object
- Maps Model to DTO object
- Maps nested objects
- Can map any object to any object if it follows the restricions
- Caches objects getters and setters methods for improve performance

## Restrictions

Maps only corresponding origin object field if it have getter method and destination object have correspongind setter method

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

### 3. Maps List

```java
    List<Discipline> disciplineList = execute(query, parameters);
    List<DisciplineDTO> disciplineDTOList = disciplineList
        .stream()
        .map(discipline -> ObjectMapper.<DisciplineDTO>map(discipline, DisciplineDTO.class))
        .collect(Collectors.toList());

```