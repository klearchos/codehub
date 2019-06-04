package ood.texteditor;

import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.SerializationUtils;

public class Memento implements Cloneable {

  private final int currentTextSelection;
  private final List<TextTab> textTabs;
  private final List<Plugin> plugins;

  public Memento(int currentTextSelection, List<TextTab> textTabs, List<Plugin> plugins) {
    this.currentTextSelection = currentTextSelection;
    this.textTabs = textTabs.stream().map(SerializationUtils::clone).collect(Collectors.toList());
    this.plugins = plugins.stream().map(SerializationUtils::clone).collect(Collectors.toList());
  }

  public int getCurrentTextSelection() {
    return currentTextSelection;
  }

  public List<TextTab> getTextTabs() {
    return textTabs.stream().map(SerializationUtils::clone).collect(Collectors.toList());
  }

  public List<Plugin> getPlugins() {
    return plugins.stream().map(SerializationUtils::clone).collect(Collectors.toList());
  }

  @Override
  public Object clone() {
    return new Memento(currentTextSelection, textTabs, plugins);
  }
}
