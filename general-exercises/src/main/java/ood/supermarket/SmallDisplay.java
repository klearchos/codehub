package ood.supermarket;

public class SmallDisplay implements MyObserver {

  @Override
  public void update(String newText) {
    System.out.println("Small Display " + newText);
  }
}
