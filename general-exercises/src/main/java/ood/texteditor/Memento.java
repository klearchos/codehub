package ood.texteditor;

import java.util.List;

public class Memento implements Cloneable {

  private final int currentTextSelection;
  private final List<TextTab> textTabs;
  private final List<Plugin> plugins;

  //TODO: complete the constructor
  public Memento(int currentTextSelection, List<TextTab> textTabs, List<Plugin> plugins) {
    this.currentTextSelection = 0;
    this.textTabs = null;
    this.plugins = null;
  }

  public int getCurrentTextSelection() {
    return currentTextSelection;
  }

  // TODO: Return the text tabs in a defensive way in order not to expose them.
  public List<TextTab> getTextTabs() {
    return null;
  }
  // TODO: Return the plugins in a defensive way in order not to expose them.
  public List<Plugin> getPlugins() {
    return null;
  }

  @Override
  public Object clone() {
    // TODO: Return a clone
    return null;
  }
}
