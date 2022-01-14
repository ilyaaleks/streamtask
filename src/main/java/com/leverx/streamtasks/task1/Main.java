package com.leverx.streamtasks.task1;

import com.leverx.streamtasks.task1.entities.Student;
import com.leverx.streamtasks.task1.services.StudentService;
import com.leverx.streamtasks.task1.services.StudentServiceImpl;
import com.leverx.streamtasks.task1.services.SubjectService;
import com.leverx.streamtasks.task1.services.SubjectServiceImpl;
import java.util.List;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    StudentService studentService = new StudentServiceImpl();
    SubjectService subjectService = new SubjectServiceImpl();

    List<Student> students = studentService.getStudents();
    Set<String> uniqueSubjects = subjectService.getUniqueSubjects(students);

    uniqueSubjects.stream()
        .forEach(uniqueSubject -> subjectService.getAverageSubjectScore(uniqueSubject, students));
  }
}
