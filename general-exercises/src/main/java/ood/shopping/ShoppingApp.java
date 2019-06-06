package ood.shopping;

public class ShoppingApp {

  public static void main(String[] args) {
    new ShoppingApp();
  }

  public ShoppingApp() {
    PriceCatalog pc = new PriceCatalog();
    pc.addItem(Item.APPLE, 50);
    pc.addItem(Item.ORANGE, 30);

    GroupDiscount appleDiscount = new GroupDiscount(Item.APPLE, 2, pc);
    GroupDiscount orangeDiscount = new GroupDiscount(Item.ORANGE, 3, pc);

    Cart cart = new Cart(pc);
    cart.addDiscount(appleDiscount);
    cart.addDiscount(orangeDiscount);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.ORANGE);
    cart.addItem(Item.APPLE);
    cart.addItem(Item.APPLE);

    System.out.println("Total with offer " + cart.getTotal());
  }
}
