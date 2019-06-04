package ood.supermarket;


public interface Subject {

  String getState();

  void setState(String text);

  void attach(MyObserver observer);

  void notifyAllObservers();
}
