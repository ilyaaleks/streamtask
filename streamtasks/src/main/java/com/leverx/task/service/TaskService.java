package com.leverx.task.service;

import com.leverx.task.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> createTasks();

    String sort(List<Task> tasks);

}
