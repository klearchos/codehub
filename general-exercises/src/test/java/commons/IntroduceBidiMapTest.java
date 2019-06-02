package commons;

import static junit.framework.TestCase.assertEquals;

import java.util.stream.Collectors;
import org.apache.commons.collections4.BidiMap;
import org.junit.Test;

public class IntroduceBidiMapTest {

  @Test
  public void initialiseDataStructure() {
    IntroduceBidiMap bmp = new IntroduceBidiMap();
    BidiMap<Integer, String> bidiMap =  bmp.initialiseDataStructure();
    assertEquals(3, bidiMap.size());
    String result = bidiMap.values().stream().collect(Collectors.joining(","));
    System.out.println(result);
    assertEquals("ONE,TWO,THREE", result);
    result = bidiMap.keySet().stream().map(String::valueOf).collect(Collectors.joining(","));
    System.out.println(result);
    assertEquals("1,2,3", result);
  }
}
