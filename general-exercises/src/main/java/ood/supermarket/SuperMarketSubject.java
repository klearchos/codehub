package ood.supermarket;

import java.util.ArrayList;
import java.util.List;

public class SuperMarketSubject implements Subject {

  private String state;
  private List<MyObserver> observers = new ArrayList<>();

  @Override
  public String getState() {
    return state;
  }

  @Override
  public void setState(String text) {
    state = text;
    System.out.println("New Subject State " + text);
    notifyAllObservers();
    System.out.println();
  }

  @Override
  public void attach(MyObserver observer) {
    observers.add(observer);
  }

  @Override
  public void notifyAllObservers() {
    observers.stream().forEach(entry -> entry.update(state));
  }
}
