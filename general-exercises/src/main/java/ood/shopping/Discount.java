package ood.shopping;

import java.util.List;

public interface Discount {

  int apply(List<Item> items);
}
