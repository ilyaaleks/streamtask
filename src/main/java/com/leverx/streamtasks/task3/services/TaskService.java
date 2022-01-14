package com.leverx.streamtasks.task3.services;

import com.leverx.streamtasks.task3.entities.Task;
import java.util.List;

public interface TaskService {

  List<Task> getNFirstSortedTasks(List<Task> unsortedTasks, int countOfFirstSortedTasks);

  String mergeTitlesByDelimiter(String delimiter, List<Task> tasks);
}
