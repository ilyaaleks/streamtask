package com.leverx.streamtasks.task1.services;

import com.leverx.streamtasks.task1.entities.Student;
import java.util.List;

public class StudentServiceImpl implements StudentService {

  @Override
  public List<Student> getStudents() {
    var firstStudent = new Student("Igor");
    var secondStudent = new Student("Artem");
    var thirdStudent = new Student("Ilya");

    firstStudent
        .rate("Math", 7)
        .rate("English", 7)
        .rate("Chemistry", 7);

    secondStudent
        .rate("Math", 8)
        .rate("English", 8)
        .rate("Chemistry", 8);

    thirdStudent
        .rate("Math", 9)
        .rate("English", 9)
        .rate("Chemistry", 9);

    return List.of(firstStudent, secondStudent, thirdStudent);
  }
}
