package ood.texteditor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.SerializationUtils;

public class TextEditor {

  private int currentTextSelection = -1;
  private List<TextTab> textTabs = new ArrayList<>();
  private List<Plugin> plugins = new ArrayList<>();

  private TextEditorStateCareTaker textEditorStateCareTaker = new TextEditorStateCareTaker();
  private int currentIndex = -1;

  public void undo() {
    if (currentIndex > 0) {
      currentIndex--;
      setState(textEditorStateCareTaker.get(currentIndex));
    }
  }

  public void redo() {
    if (currentIndex < textEditorStateCareTaker.getSize() - 1) {
      currentIndex++;
      setState(textEditorStateCareTaker.get(currentIndex));
    }
  }

  private void setState(Memento memento) {
    this.setCurrentTextSelection(memento.getCurrentTextSelection());
    this.setPlugins(memento.getPlugins());
    this.setTextTabs(memento.getTextTabs());
  }

  public void clearAll() {
    currentIndex = -1;
    currentTextSelection = -1;
    plugins.clear();
    textTabs.clear();
    textEditorStateCareTaker.clearHistory();
  }

  public void saveStateToMemento() {
    currentIndex++;
    textEditorStateCareTaker.add(new Memento(currentTextSelection, getTextTabs(), getPlugins()));
  }

  public int getCurrentTextSelection() {
    return currentTextSelection;
  }

  public void setCurrentTextSelection(int currentTextSelection) {
    this.currentTextSelection = currentTextSelection;
  }

  public List<TextTab> getTextTabs() {
    return textTabs.stream().map(SerializationUtils::clone).collect(Collectors.toList());
  }

  public void setTextTabs(List<TextTab> textTabs) {
    this.textTabs = textTabs.stream().map(SerializationUtils::clone)
        .collect(Collectors.toList());
  }

  public List<Plugin> getPlugins() {
    return plugins.stream().map(SerializationUtils::clone).collect(Collectors.toList());
  }

  public void setPlugins(List<Plugin> plugins) {
    this.plugins = plugins.stream().map(SerializationUtils::clone).collect(Collectors.toList());
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
