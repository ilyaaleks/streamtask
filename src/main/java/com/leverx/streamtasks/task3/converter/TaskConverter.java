package com.leverx.streamtasks.task3.converter;

import com.leverx.streamtasks.task3.dto.TaskDto;
import com.leverx.streamtasks.task3.entities.Task;
import java.util.List;
import java.util.stream.Collectors;

public class TaskConverter {

  public Task convertToTask(TaskDto taskDto) {
    return new Task(taskDto.getTitle(), taskDto.getType(), null);
  }

  public List<Task> convertToTask(List<TaskDto> taskDtoList) {
    return taskDtoList.stream()
        .map(taskDto -> convertToTask(taskDto))
        .collect(Collectors.toList());
  }

  public TaskDto convertToTaskDto(Task task) {
    return new TaskDto(task.getId(), task.getTitle(), task.getType(), task.getCreatedOn());
  }

  public List<TaskDto> convertToTaskDto(List<Task> tasks) {
    return tasks.stream()
        .map(task -> convertToTaskDto(task))
        .collect(Collectors.toList());
  }
}
