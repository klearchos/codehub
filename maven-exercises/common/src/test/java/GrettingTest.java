import static org.junit.Assert.assertEquals;

import model.Greeting;
import org.junit.Test;

public class GrettingTest {

  @Test
  public void greetingTest() {
    Greeting greeting = new Greeting(1L, "context");
    assertEquals("context", greeting.getContent());
  }
}
