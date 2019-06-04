package ood.supermarket;

public class BigDisplay implements MyObserver {

  @Override
  public void update(String newText) {
    System.out.println("Big Display " + newText);
  }
}
