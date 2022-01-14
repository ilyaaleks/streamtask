package com.leverx.streamtasks.task1.entities;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

public class Student {

  @Getter
  @Setter
  private Map<String, Integer> rating;

  @Getter
  @Setter
  private String name;

  public Student(String name) {
    rating = new HashMap<>();
    this.name = name;
  }

  public Student rate(String subject, Integer rate) {
    rating.put(subject, rate);
    return this;
  }
}
