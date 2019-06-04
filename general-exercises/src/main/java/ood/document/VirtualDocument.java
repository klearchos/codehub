package ood.document;

import java.net.URL;

public class VirtualDocument extends AbstractDocument implements Document {

  private RealDocument realDocument;

  public VirtualDocument(String title, URL url) {
    super(title, url);
  }

//  @Override
//  public String getTitle() {
//    return super.getTitle();
//  }

//  @Override
//  public URL getUrl() {
//    return super.getUrl();
//  }

  @Override
  public byte[] retrieveDocument() {
    if (realDocument == null) {
      System.out.println("Creating RealDocument");
      realDocument = new RealDocument(title, url);
    }
    return realDocument.retrieveDocument();
  }
}
