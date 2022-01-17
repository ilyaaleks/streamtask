package com.leverx.streamtasks.task4;

import com.leverx.streamtasks.task4.services.CharacterServiceImpl;

public class Main {

  public static void main(String[] args) {
    var a = "a4a4a4a4";
    var characterService = new CharacterServiceImpl();

    var charsAndCount = characterService.getCharsAndCountInString(a);
    var frequentCharInMap = characterService.getMaxCharAndCount(charsAndCount);

    System.out.println(frequentCharInMap);
  }
}
