package ood.document;

import java.net.URL;

public interface Document {

  String getTitle();

  URL getUrl();

  byte[] retrieveDocument();
}
