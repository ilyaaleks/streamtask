package com.leverx.task.service.Impl;

import com.leverx.task.entity.Student;
import com.leverx.task.service.StudentService;

import java.util.Arrays;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    public List<Student> createStudents() {
        Student st1 = new Student("Mary");
        st1.rate("Math", 5);
        st1.rate("History", 3);
        st1.rate("English", 4);
        st1.rate("Physics", 4);

        Student st2 = new Student("Anna");
        st2.rate("Math", 4);
        st2.rate("History", 5);
        st2.rate("English", 5);
        st1.rate("Physics", 5);
        st2.rate("Literature", 5);

        Student st3 = new Student("Polina");
        st3.rate("Math", 5);
        st3.rate("History", 3);
        st3.rate("English", 3);

        return Arrays.asList(st1, st2, st3);
    }

    public double averageRate(List<Student> students, String subject) {
        return students.stream()
                .filter(student -> student.getRating().containsKey(subject))
                .mapToInt(student -> student.getRating().get(subject))
                .average()
                .orElse(0);
    }
}
