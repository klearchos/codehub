package ood.texteditor;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TextEditorAppTest {

  private static final String P1_NAME = "xml";

  private List<TextTab> tbs;
  private List<Plugin> plugins;

  @Before
  public void setup() {
    tbs = new ArrayList<>();
    TextTab t1 = new TextTab("T1 Name", "T1 Title");
    TextTab t2 = new TextTab("T2 Name", "T2 Title");
    tbs.add(t1);
    tbs.add(t2);

    plugins = new ArrayList<>();
    Plugin p1 = new Plugin(P1_NAME, "www.xml.com");
    Plugin p2 = new Plugin("json", "www.json.com");
    plugins.add(p1);
    plugins.add(p2);
  }


  @Test
  public void textEditorNormalCase() {
    String newPluginName = "jstool";
    TextEditor te = new TextEditor();
    te.setPlugins(plugins);
    te.setTextTabs(tbs);
    te.saveStateToMemento();

    plugins.set(0, new Plugin(newPluginName, "www.google.com"));
    te.setPlugins(plugins);
    te.saveStateToMemento();

    assertEquals(newPluginName, te.getPlugins().get(0).getName());

    te.undo();
    assertEquals(P1_NAME, te.getPlugins().get(0).getName());

    te.undo();
    te.undo();
    te.undo();
    assertEquals(P1_NAME, te.getPlugins().get(0).getName());

    te.redo();
    assertEquals(newPluginName, te.getPlugins().get(0).getName());

    te.redo();
    te.redo();
    te.redo();
    assertEquals(newPluginName, te.getPlugins().get(0).getName());

    te.clearAll();
    assertEquals(0, te.getPlugins().size());
    assertEquals(0, te.getTextTabs().size());
    assertEquals(-1, te.getCurrentTextSelection());
  }
}
