package ood.shopping;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceCatalogTest {

  @Test
  public void emptyCatalog() {
    PriceCatalog pc = new PriceCatalog();
    assertEquals(0, pc.getPrice(Item.ORANGE));
  }

  @Test
  public void orangeOnly() {
    PriceCatalog pc = new PriceCatalog();
    pc.addItem(Item.ORANGE, 30);
    assertEquals(30, pc.getPrice(Item.ORANGE));
  }

  @Test
  public void appleOnly() {
    PriceCatalog pc = new PriceCatalog();
    pc.addItem(Item.APPLE, 50);
    assertEquals(50, pc.getPrice(Item.APPLE));
  }

  @Test
  public void moreThanOne() {
    PriceCatalog pc = new PriceCatalog();
    pc.addItem(Item.APPLE, 50);
    pc.addItem(Item.ORANGE, 30);
    assertEquals(50, pc.getPrice(Item.APPLE));
    assertEquals(30, pc.getPrice(Item.ORANGE));
  }

}
