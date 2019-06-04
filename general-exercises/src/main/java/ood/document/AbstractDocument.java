package ood.document;

import java.net.URL;

public class AbstractDocument {

  protected String title;
  protected URL url;

  AbstractDocument(String title, URL url) {
    this.title = title;
    this.url = url;
  }

  public String getTitle() {
    return title;
  }

  public URL getUrl() {
    return url;
  }
}
