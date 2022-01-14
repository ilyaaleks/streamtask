package com.leverx.streamtasks.task3.dto;

import com.leverx.streamtasks.task3.entities.TaskType;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public class TaskDto {

  private final String id;
  private final String title;
  private final TaskType type;
  private final LocalDate createdOn;
  private Set<String> tags = new HashSet<>();
}
