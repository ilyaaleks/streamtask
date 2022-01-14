package com.leverx.streamtasks.task2.services;

import com.leverx.streamtasks.task2.entities.Task;
import java.util.List;

public interface TaskService {

  List<Task> getNFirstSortedTasks(List<Task> unsortedTasks, int countOfFirstSortedTasks);

  String mergeTitlesByDelimiter(String delimiter, List<Task> tasks);
}
