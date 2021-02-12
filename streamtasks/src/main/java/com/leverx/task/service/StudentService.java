package com.leverx.task.service;

import com.leverx.task.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> createStudents();

    double averageRate(List<Student> students, String subject);
}
