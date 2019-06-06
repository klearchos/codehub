package ood.shopping;

import java.util.HashMap;
import java.util.Map;

public class PriceCatalog {

  private Map<Item, Integer> priceCatalog = new HashMap<>();

  public void addItem(Item item, int price) {
    priceCatalog.put(item, price);
  }

  public int getPrice(Item item) {
    return priceCatalog.getOrDefault(item, 0);
  }

}
