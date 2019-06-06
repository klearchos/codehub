package ood.shopping;

import java.util.List;

public class Cart {

  // TODO: Initialise the List.
  private List<Item> items;
  private int total;
  private PriceCatalog pc;
  // TODO: Initialise the List.
  private List<Discount> dcs;

  Cart(PriceCatalog pc) {
    //TODO: Initialise adequately the PriceCatalog
    this.pc = null;
  }

  // TODO: Calculate the total price.
  // If we have Discounts available then calculate these as well.
  public int getTotal() {
    return -1;
  }

  // TODO: Return the items
  public List<Item> getItems() {
    return null;
  }

  // TODO: Add the new item in the cart and update the total price
  public void addItem(Item item) {
  }

  // TODO: Add a new discount to the cart
  public void addDiscount(Discount discount) {
  }
}
