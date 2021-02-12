package com.leverx.task.service.Impl;

import com.leverx.task.entity.Task;
import com.leverx.task.entity.TaskDTO;
import com.leverx.task.service.TaskDTOService;

import java.util.List;

public class TaskDTOServiceImpl implements TaskDTOService {

    public TaskDTO convert(Task task) {
        return new TaskDTO(task.getId(), task.getTitle(), task.getType(), task.getCreatedOn());
    }

    public Object[] convertTasksToTaskDTO(List<Task> tasks) {
        return tasks.stream().map(task -> new TaskDTOServiceImpl().convert(task)).toArray();
    }

}
