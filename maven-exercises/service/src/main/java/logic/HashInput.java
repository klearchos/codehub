package logic;

import org.apache.commons.lang3.RandomStringUtils;

public class HashInput {

  public String hash(String input) {
    return input + ": " + RandomStringUtils.random(10, true, true);
  }
}
