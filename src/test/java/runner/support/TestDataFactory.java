package runner.support;


import org.apache.commons.lang3.RandomStringUtils;


public class TestDataFactory
{
  public static String getRandomMail() {
      String lowerCharacters = "abcdefghijklmnopqrstuvwxyz";
      String upperCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String numberCharacter = "0123456789";
      return "diegoteste"
              + RandomStringUtils.random(1, lowerCharacters)
              + RandomStringUtils.random(1, upperCharacters)
              + RandomStringUtils.random(2, numberCharacter)
              + "@gmail.com";
  }
}
