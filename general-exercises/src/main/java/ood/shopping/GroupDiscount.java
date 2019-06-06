package ood.shopping;

import java.util.Collections;
import java.util.List;

public class GroupDiscount implements Discount {

  private final Item item;
  private final int minGroupItems;
  private final PriceCatalog pc;

  GroupDiscount(Item item, int minGroupItems, PriceCatalog pc) {
    this.item = item;
    this.minGroupItems = minGroupItems;
    this.pc = pc;
  }

  @Override
  public int apply(List<Item> items) {
    int frequency = Collections.frequency(items, item);
    return (frequency / minGroupItems) * pc.getPrice(item);
  }
}
