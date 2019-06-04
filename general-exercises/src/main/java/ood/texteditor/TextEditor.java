package ood.texteditor;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {

  private int currentTextSelection = -1;
  private List<TextTab> textTabs = new ArrayList<>();
  private List<Plugin> plugins = new ArrayList<>();

  private TextEditorStateCareTaker textEditorStateCareTaker = new TextEditorStateCareTaker();
  private int currentIndex = -1;

  // TODO: Only if the currentIndex is greater than 0 call the careTaker
  public void undo() {
  }

  // TODO: Only if the currentIndex is less than the number of the available states call the careTaker
  public void redo() {
  }

  // TODO: Set the current state from the provided Memento
  private void setState(Memento memento) {
  }

  // TODO: reset the state and the careTaker
  public void clearAll() {
  }

  // TODO: Save the current state to the caretaker
  public void saveStateToMemento() {
  }

  public int getCurrentTextSelection() {
    return currentTextSelection;
  }

  public void setCurrentTextSelection(int currentTextSelection) {
    this.currentTextSelection = currentTextSelection;
  }

  // TODO: Return the text tabs in a defensive way
  public List<TextTab> getTextTabs() {
    return null;
  }

  // TODO: Set the text tabs (defensively)
  public void setTextTabs(List<TextTab> textTabs) {
  }

  // TODO: Return the plugins (defensively)
  public List<Plugin> getPlugins() {
    return null;
  }

  // TODO: Set the plugins (defensive)
  public void setPlugins(List<Plugin> plugins) {
  }

  @Override
  public String toString() {
    return "texteditor{" +
        "currentTextSelection=" + currentTextSelection +
        ", textTabs=" + textTabs +
        ", plugins=" + plugins +
        '}';
  }
}
