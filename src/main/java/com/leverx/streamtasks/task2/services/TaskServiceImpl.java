package com.leverx.streamtasks.task2.services;

import com.leverx.streamtasks.task2.entities.Task;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskServiceImpl implements TaskService {

  @Override
  public List<Task> getNFirstSortedTasks(List<Task> unsortedTasks, int countOfFirstSortedTasks) {
    return unsortedTasks.stream()
        .sorted(Comparator.comparing(Task::getCreatedOn))
        .limit(countOfFirstSortedTasks)
        .collect(Collectors.toList());
  }

  @Override
  public String mergeTitlesByDelimiter(String delimiter, List<Task> tasks) {
    return tasks.stream()
        .map(task -> task.getTitle())
        .collect(Collectors.joining(delimiter));
  }
}
