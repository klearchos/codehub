package ood.shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  private List<Item> items = new ArrayList<>();
  private int total;
  private final PriceCatalog pc;
  private List<Discount> dcs = new ArrayList<>();

  Cart(PriceCatalog pc) {
    this.pc = pc;
  }

  public int getTotal() {
    if (dcs.size() > 0) {
      int discounts = dcs.stream().mapToInt(discount -> discount.apply(items)).sum();
      return total -= discounts;
    }
    return total;
  }

  public List<Item> getItems() {
    return items;
  }

  public void addItem(Item item) {
    this.items.add(item);
    total += pc.getPrice(item);
  }

  public void addDiscount(Discount discount) {
    dcs.add(discount);
  }
}
