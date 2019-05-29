package commons;

import static org.junit.Assert.assertTrue;

import java.util.stream.Collectors;
import org.apache.commons.collections4.BidiMap;
import org.junit.Test;

public class IntroduceBidiMapTest {

  @Test
  public void initialiseDataStructure() {
    IntroduceBidiMap bmp = new IntroduceBidiMap();
    BidiMap<Integer, String> bidiMap =  bmp.initialiseDataStructure();
    assertTrue(bidiMap.size() == 3);
    String result = bidiMap.values().stream().collect(Collectors.joining(","));
    System.out.println(result);
    assertTrue("ONE,TWO,THREE".equals(result));
    result = bidiMap.keySet().stream().map(entry -> String.valueOf(entry)).collect(Collectors.joining(","));
    System.out.println(result);
    assertTrue("1,2,3".equals(result));
  }
}
