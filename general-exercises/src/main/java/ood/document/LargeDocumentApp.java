package ood.document;

import java.net.MalformedURLException;
import java.net.URL;

public class LargeDocumentApp {

  public static void main(String[] args) throws MalformedURLException {
    new LargeDocumentApp();
  }

  public LargeDocumentApp() throws MalformedURLException {
    Document rd = new VirtualDocument("", new URL("http://www.google.com"));
    System.out.println("Title " + rd.getTitle());
    System.out.println("Title " + rd.getUrl());
    System.out.println("Title " + rd.retrieveDocument());
  }
}
