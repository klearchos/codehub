package ood.shopping;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class GroupDiscountTest {

  private PriceCatalog pc;
  private GroupDiscount appleDiscount;
  private GroupDiscount orangeDiscount;


  @Before
  public void setup() {
    pc = new PriceCatalog();
    pc.addItem(Item.APPLE, 50);
    pc.addItem(Item.ORANGE, 30);

    appleDiscount = new GroupDiscount(Item.APPLE, 2, pc);
    orangeDiscount = new GroupDiscount(Item.ORANGE, 3, pc);
  }

  @Test
  public void emptyCart() {
    assertEquals(0, appleDiscount.apply(new ArrayList<>()));
  }

  @Test
  public void oneApple() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.APPLE);
    assertEquals(0, appleDiscount.apply(cart));
  }

  @Test
  public void oneOrange() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.ORANGE);
    assertEquals(0, orangeDiscount.apply(cart));
  }

  @Test
  public void twoApples() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.APPLE);
    cart.add(Item.APPLE);
    assertEquals(50, appleDiscount.apply(cart));
  }

  @Test
  public void twoOranges() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    assertEquals(0, orangeDiscount.apply(cart));
  }

  @Test
  public void threeApples() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.APPLE);
    cart.add(Item.APPLE);
    cart.add(Item.APPLE);
    assertEquals(50, appleDiscount.apply(cart));
  }

  @Test
  public void threeOranges() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    assertEquals(30, orangeDiscount.apply(cart));
  }

  @Test
  public void fourApples() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.APPLE);
    cart.add(Item.APPLE);
    cart.add(Item.APPLE);
    cart.add(Item.APPLE);
    assertEquals(100, appleDiscount.apply(cart));
  }

  @Test
  public void fourOranges() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    assertEquals(30, orangeDiscount.apply(cart));
  }

  @Test
  public void onlyAppleDiscount() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    cart.add(Item.APPLE);
    cart.add(Item.APPLE);
    assertEquals(0, orangeDiscount.apply(cart));
    assertEquals(50, appleDiscount.apply(cart));
  }

  @Test
  public void onlyOrangeDiscount() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    cart.add(Item.APPLE);
    assertEquals(30, orangeDiscount.apply(cart));
    assertEquals(0, appleDiscount.apply(cart));
  }

  @Test
  public void bothDiscount() {
    List<Item> cart = new ArrayList<>();
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    cart.add(Item.ORANGE);
    cart.add(Item.APPLE);
    cart.add(Item.APPLE);
    assertEquals(30, orangeDiscount.apply(cart));
    assertEquals(50, appleDiscount.apply(cart));
  }

}
