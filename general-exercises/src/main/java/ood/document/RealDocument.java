package ood.document;

import java.net.URL;

public class RealDocument extends AbstractDocument implements Document {

  public RealDocument(String title, URL url) {
    super(title, url);
  }

  @Override
  public byte[] retrieveDocument() {
    System.out.println("retrieveDocument from real one called");
    return new byte[0];
  }
}
