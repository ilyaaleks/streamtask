package com.leverx.streamtasks.task4.services;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterServiceImpl implements CharacterService {

  @Override
  public Map<Character, Long> getCharsAndCountInString(String target) {
    return target.chars()
        .mapToObj(codeOfCharacter -> (char) codeOfCharacter)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

  }

  @Override
  public Entry<Character, Long> getMaxCharAndCount(Map<Character, Long> target) {
    return target.entrySet().stream()
        .max(Comparator.comparing(Entry::getValue)).get();
  }
}
