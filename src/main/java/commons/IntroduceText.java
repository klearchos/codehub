package commons;

import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.simple.RandomSource;
import org.apache.commons.text.RandomStringGenerator;
import org.apache.commons.text.WordUtils;
import org.apache.commons.text.diff.EditScript;
import org.apache.commons.text.diff.StringsComparator;

public class IntroduceText {

  public static final String CAPITALS = "THIS IS A SENTENCE IN CAPITALS";

  public static void main(String[] args) {
    new IntroduceText();
  }

  public IntroduceText() {
  }

  public String convertCases(String input) {
    return WordUtils.swapCase(input);
  }

  public int calculateDiff(String str1, String str2) {
    StringsComparator cmp = new StringsComparator(str1, str2);
    EditScript<Character> script = cmp.getScript();
    return script.getModifications();
  }

  public String generateRandomString() {
    UniformRandomProvider rng = RandomSource.create(RandomSource.MT);
    RandomStringGenerator generator = new RandomStringGenerator.Builder()
        .withinRange('a', 'z')
        .usingRandom(rng::nextInt)
        .build();
    return generator.generate(20);
  }
}
