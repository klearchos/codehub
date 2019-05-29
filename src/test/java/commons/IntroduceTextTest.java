package commons;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntroduceTextTest {

  @Test
  public void convertCases() {
    IntroduceText text = new IntroduceText();
    assertEquals("this is a sentence in capitals",
        text.convertCases(IntroduceText.CAPITALS));
  }

  @Test
  public void calculateDiff() {
    IntroduceText text = new IntroduceText();
    assertEquals(8, text.calculateDiff("ANAGRAM", "MARGANA"));
    assertEquals(2, text.calculateDiff("Klearchos", "Klearchou"));
  }

  @Test
  public void generateRandomString() {
    IntroduceText text = new IntroduceText();
    assertEquals(20, text.generateRandomString().length());
  }
}
