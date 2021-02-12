package com.leverx.task.service;

import com.leverx.task.entity.Task;
import com.leverx.task.entity.TaskDTO;

import java.util.List;

public interface TaskDTOService {
    TaskDTO convert(Task task);

    Object[] convertTasksToTaskDTO(List<Task> tasks);
}
