package ood.texteditor;

import java.util.ArrayList;
import java.util.List;

public class TextEditorStateCareTaker {

  private List<Memento> states = new ArrayList<>(10);

  public void add(Memento memento) {
    states.add((Memento)memento.clone());
  }

  public Memento get(int index) {
    return (Memento)states.get(index).clone();
  }

  public void clearHistory() {
    states.clear();
  }

  public int getSize() {
    return states.size();
  }
}
