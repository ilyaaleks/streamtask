package com.leverx.streamtasks.task1.services;

import com.leverx.streamtasks.task1.entities.Student;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubjectServiceImpl implements SubjectService {

  @Override
  public double getAverageSubjectScore(String subject, List<Student> students) {
    return students.stream()
        .filter(student -> student.getRating().containsKey(subject))
        .mapToInt(student -> student.getRating().get(subject))
        .average()
        .orElse(0);
  }

  @Override
  public Set<String> getUniqueSubjects(List<Student> students) {
    return students.stream()
        .map(student -> student.getRating().keySet().stream())
        .reduce(Stream::concat)
        .get()
        .collect(Collectors.toSet());
  }
}
