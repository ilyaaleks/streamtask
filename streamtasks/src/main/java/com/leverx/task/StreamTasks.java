package com.leverx.task;

import com.leverx.task.service.Impl.StudentServiceImpl;
import com.leverx.task.service.Impl.TaskDTOServiceImpl;
import com.leverx.task.service.Impl.TaskServiceImpl;
import com.leverx.task.service.StudentService;
import com.leverx.task.service.TaskDTOService;
import com.leverx.task.service.TaskService;

public class StreamTasks {
    public static void main(String[] args) {

        StudentService studentService = new StudentServiceImpl();
        studentService.averageRate(studentService.createStudents(), "Math");

        TaskService taskService = new TaskServiceImpl();
        taskService.sort(taskService.createTasks());

        TaskDTOService taskDTOService = new TaskDTOServiceImpl();
        taskDTOService.convertTasksToTaskDTO(taskService.createTasks());
    }
}
