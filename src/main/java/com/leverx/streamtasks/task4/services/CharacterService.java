package com.leverx.streamtasks.task4.services;

import java.util.Map;
import java.util.Map.Entry;

public interface CharacterService {

  Map<Character, Long> getCharsAndCountInString(String target);

  Entry<Character, Long> getMaxCharAndCount(Map<Character,Long> target);
}
