package ood.supermarket;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class SuperMarketTest {

  @Test
  public void superMarketCheck() {
    SuperMarketSubject ss = new SuperMarketSubject();
    SmallDisplay sd = mock(SmallDisplay.class);
    BigDisplay bd = mock(BigDisplay.class);

    ss.attach(sd);
    ss.attach(bd);
    ss.setState("New text");

    verify(sd, times(1)).update(any());
    verify(bd, times(1)).update(any());


  }

}
