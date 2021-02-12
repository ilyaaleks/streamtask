package com.leverx.task.entity;

import com.leverx.task.entity.enums.TaskType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class TaskDTO {
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
    private Set<String> tags = new HashSet<>();

}
