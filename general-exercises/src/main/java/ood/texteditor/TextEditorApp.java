package ood.texteditor;

import java.util.ArrayList;
import java.util.List;

public class TextEditorApp {

  public static void main(String[] args) {

    // create a texteditor with contents
    TextEditor te = new TextEditor();
    te.setCurrentTextSelection(1);

    List<TextTab> tbs = new ArrayList<>();
    TextTab t1 = new TextTab("T1 Name", "T1 Title");
    TextTab t2 = new TextTab("T2 Name", "T2 Title");
    tbs.add(t1);
    tbs.add(t2);
    te.setTextTabs(tbs);

    List<Plugin> plugins = new ArrayList<>();
    Plugin p1 = new Plugin("xml", "www.xml.com");
    Plugin p2 = new Plugin("json", "www.json.com");
    plugins.add(p1);
    plugins.add(p2);
    te.setPlugins(plugins);
    System.out.println(te.toString());
    te.saveStateToMemento();

    Plugin p3 = new Plugin("xyz", "www.xyz.com");
    plugins.add(p3);
    te.setPlugins(plugins);
    System.out.println(te.toString());
    te.saveStateToMemento();

    plugins.clear();
    te.setPlugins(plugins);
    te.saveStateToMemento();
    System.out.println("Cleared " + te.toString());

    te.undo();
    System.out.println("Undo " + te.toString());

    te.redo();
    System.out.println("Redo " + te.toString());

  }
}
