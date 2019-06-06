package ood.shopping;

import java.util.List;

public class GroupDiscount implements Discount {

  private Item item;
  private int minGroupItems;
  private PriceCatalog pc;

  GroupDiscount(Item item, int minGroupItems, PriceCatalog pc) {
    this.item = item;
    this.minGroupItems = minGroupItems;
    this.pc = pc;
  }

  // TODO: calculate the group discount price
  @Override
  public int apply(List<Item> items) {
    return -1;
  }
}
