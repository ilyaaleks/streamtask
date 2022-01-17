package com.leverx.streamtasks.task2.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

public class Task {

  @Getter
  private final String id;

  @Getter
  private final String title;

  @Getter
  private final TaskType type;

  @Getter
  private final LocalDate createdOn;

  @Getter
  @Setter
  private boolean done = false;

  @Getter
  @Setter
  private Set<String> tags = new HashSet<>();

  @Getter
  @Setter
  private LocalDate dueTo;

  public Task(String title, TaskType taskType, LocalDate dueTo) {
    this.id = UUID.randomUUID().toString();
    this.title = title;
    this.type = taskType;
    this.createdOn = LocalDate.now();
    this.dueTo = dueTo;
  }

  public Task addTag(String tag) {
    tags.add(tag);
    return this;
  }
}
