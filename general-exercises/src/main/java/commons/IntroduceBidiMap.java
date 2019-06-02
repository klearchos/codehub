package commons;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.BidiMap;

public class IntroduceBidiMap {

  private static final List<String> numbers = Arrays.asList("ONE", "TWO", "THREE");
  private static final List<Integer> numbersInt = Arrays.asList(1, 2, 3);

  public static void main(String[] args) {
    new IntroduceBidiMap();
  }

  // TODO: Choose the adequate BidiMap implementation from the Apache Commons Collections that
  // is the best fit for the following problem description:
  // We want to efficiently keep the K -> V and V -> K without having to keep double
  // storage size. We need to keep in ascending order the keys and the values.
  // Our data structure will be mostly used for reading.
  // The put and delete will be relatively used  not so often.
  // TODO variation: What will happen if we set the String as the key of the BidiMap and the
  // Integer as the value ? The tests will run successfully?
  IntroduceBidiMap() {
  }

  public BidiMap<Integer, String> initialiseDataStructure() {
    return null;
  }
}
