package ood.texteditor;

import static junit.framework.TestCase.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class MementoTest {

  private List<TextTab> tbs;
  private List<Plugin> plugins;

  @Before
  public void createLists() {
    tbs = new ArrayList<>();
    TextTab t1 = new TextTab("T1 Name", "T1 Title");
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
  public void checkEncapsulation() {
    Memento memento = new Memento(1, tbs, plugins);
    plugins.clear();
    tbs.clear();
    assertEquals(2, memento.getPlugins().size());
    assertEquals(2, memento.getTextTabs().size());
  }

  @Test
  public void checkEncapsulationGet() {
    Memento memento = new Memento(1, tbs, plugins);
    memento.getPlugins().set(0, null);
    assertEquals(plugins.get(0), memento.getPlugins().get(0));
  }
}
