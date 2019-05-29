package commons;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class IntroduceBidiMap {

  private static final List<String> numbers = Arrays.asList("ONE", "TWO", "THREE");
  private static final List<Integer> numbersInt = Arrays.asList(1, 2, 3);

  public static void main(String[] args) {
    new IntroduceBidiMap();
  }

  IntroduceBidiMap() {
  }

  public BidiMap<Integer, String> initialiseDataStructure() {
    TreeBidiMap<Integer, String> bidiMap = new  TreeBidiMap<>();
    for(int i = 0; i < numbers.size(); i++) {
      bidiMap.put(numbersInt.get(i), numbers.get(i));
    }
    return bidiMap;
  }
}
