package com.leverx.streamtasks.task1.services;

import com.leverx.streamtasks.task1.entities.Student;
import java.util.List;
import java.util.Set;

public interface SubjectService {

  double getAverageSubjectScore(String subject, List<Student> students);

  Set<String> getUniqueSubjects(List<Student> students);
}
