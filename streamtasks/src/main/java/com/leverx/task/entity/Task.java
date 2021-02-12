package com.leverx.task.entity;

import com.leverx.task.entity.enums.TaskType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
public class Task {
    @Getter
    @Setter
    private String id;

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
    private final Set<String> tags = new HashSet<>();

    @Getter
    @Setter
    private LocalDate dueTo;

    public Task addTag(String tag) {
        tags.add(tag);
        return this;
    }
}