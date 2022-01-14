package com.leverx.streamtasks.task3;

import com.leverx.streamtasks.task3.entities.Task;
import com.leverx.streamtasks.task3.entities.TaskType;
import com.leverx.streamtasks.task3.services.TaskService;
import com.leverx.streamtasks.task3.services.TaskServiceImpl;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    TaskService taskService = new TaskServiceImpl();

    Task task1 = new Task("Read Version Control with Git book", TaskType.READING,
        LocalDate.of(2015, Month.JULY, 1)).addTag("git").addTag("reading").addTag("books");
    Task task2 = new Task("Read Java 8 Lambdas book", TaskType.READING,
        LocalDate.of(2015, Month.JULY, 2)).addTag("java8").addTag("reading").addTag("books");
    Task task3 = new Task("Write a mobile application to store my tasks", TaskType.CODING,
        LocalDate.of(2015, Month.JULY, 3)).addTag("coding").addTag("mobile");
    Task task4 = new Task("Write a blog on Java 8 Streams", TaskType.WRITING,
        LocalDate.of(2015, Month.JULY, 4)).addTag("blogging").addTag("writing").addTag("streams");
    Task task5 = new Task("Read Domain Driven Design book", TaskType.READING,
        LocalDate.of(2015, Month.JULY, 5)).addTag("ddd").addTag("books").addTag("reading");
    List<Task> tasks = Arrays.asList(task1, task2, task3, task4, task5);

    List<Task> sortedTasks = taskService.getNFirstSortedTasks(tasks, 5);
    String allTitles = taskService.mergeTitlesByDelimiter(" , ", sortedTasks);

    System.out.println(allTitles);
  }
}
