package ood.texteditor;

import static junit.framework.TestCase.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TextEditorStateCareTakerTest {

  private static final String T1_NAME = "T1 Name";

  private List<TextTab> tbs;
  private List<Plugin> plugins;

  @Before
  public void setup() {
    tbs = new ArrayList<>();
    TextTab t1 = new TextTab(T1_NAME, "T1 Title");
    TextTab t2 = new TextTab("T2 Name", "T2 Title");
    tbs.add(t1);
    tbs.add(t2);

    plugins = new ArrayList<>();
    Plugin p1 = new Plugin("xml", "www.xml.com");
    Plugin p2 = new Plugin("json", "www.json.com");
    plugins.add(p1);
    plugins.add(p2);
  }

  @Test
  public void checkCareTaker() {
    Memento mem = new Memento(1, tbs, plugins);
    TextEditorStateCareTaker careTaker = new TextEditorStateCareTaker();
    careTaker.add(mem);
    assertEquals(1, careTaker.getSize());
  }

  @Test
  public void checkCareTakerRef() {
    Memento mem = new Memento(1, tbs, plugins);
    TextEditorStateCareTaker careTaker = new TextEditorStateCareTaker();
    careTaker.add(mem);
    mem = null;
    tbs = null;
    plugins = null;
    assertEquals(T1_NAME, careTaker.get(0).getTextTabs().get(0).getName());
  }

  @Test
  public void checkCareTakerUndo() {
    TextEditorStateCareTaker careTaker = new TextEditorStateCareTaker();
    Memento mem1 = new Memento(1, tbs, plugins);
    careTaker.add(mem1);
    tbs.clear();
    Memento mem2 = new Memento(2, tbs, plugins);
    careTaker.add(mem2);

    assertEquals(T1_NAME, careTaker.get(0).getTextTabs().get(0).getName());
    assertEquals(0, careTaker.get(1).getTextTabs().size());
  }

  @Test
  public void checkCareTakerClearHistory() {
    TextEditorStateCareTaker careTaker = new TextEditorStateCareTaker();
    Memento mem1 = new Memento(1, tbs, plugins);
    careTaker.add(mem1);
    tbs.clear();
    Memento mem2 = new Memento(2, tbs, plugins);
    careTaker.add(mem2);
    careTaker.clearHistory();

    assertEquals(0, careTaker.getSize());
  }
}
