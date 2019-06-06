package ood.shopping;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CartTest {

  private PriceCatalog pc;
  private Discount appleDiscount;
  private Discount orangeDiscount;

  @Before
  public void setup() {
    pc = new PriceCatalog();
    pc.addItem(Item.ORANGE, 30);
    pc.addItem(Item.APPLE, 50);

    appleDiscount = new GroupDiscount(Item.APPLE, 2, pc);
    orangeDiscount = new GroupDiscount(Item.ORANGE, 3, pc);
  }

  @Test
  public void emptyCart() {
    Cart cart = new Cart(pc);
    assertEquals(0, cart.getTotal());
    assertEquals(0, cart.getItems().size() );
  }

  @Test
  public void oneAppleCartNoDiscount() {
    Cart cart = new Cart(pc);
    cart.addItem(Item.APPLE);
    assertEquals(50, cart.getTotal());
    assertEquals(1, cart.getItems().size() );
  }

  @Test
  public void oneOrangeCartNoDiscount() {
    Cart cart = new Cart(pc);
    cart.addItem(Item.ORANGE);
    assertEquals(30, cart.getTotal());
    assertEquals(1, cart.getItems().size() );
  }

  @Test
  public void twoApplesNoDiscount() {
    Cart cart = new Cart(pc);
    cart.addItem(Item.APPLE);
    cart.addItem(Item.APPLE);
    assertEquals(100, cart.getTotal());
    assertEquals(2, cart.getItems().size() );
  }

  @Test
  public void twoApplesWithDiscount() {
    Cart cart = new Cart(pc);
    cart.addItem(Item.APPLE);
    cart.addItem(Item.APPLE);
    cart.addDiscount(appleDiscount);
    assertEquals(50, cart.getTotal());
    assertEquals(2, cart.getItems().size() );
  }

  @Test
  public void threeOrangesWithDiscount() {
    Cart cart = new Cart(pc);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.ORANGE);
    cart.addDiscount(orangeDiscount);
    assertEquals(60, cart.getTotal());
    assertEquals(3, cart.getItems().size() );
  }

  @Test
  public void fourOrangesWithDiscount() {
    Cart cart = new Cart(pc);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.ORANGE);
    cart.addDiscount(orangeDiscount);
    assertEquals(90, cart.getTotal());
    assertEquals(4, cart.getItems().size() );
  }

  @Test
  public void multiWithDiscount() {
    Cart cart = new Cart(pc);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.APPLE);
    cart.addItem(Item.APPLE);
    cart.addItem(Item.APPLE);
    cart.addDiscount(orangeDiscount);
    cart.addDiscount(appleDiscount);
    assertEquals(190, cart.getTotal());
    assertEquals(7, cart.getItems().size() );
  }
}
