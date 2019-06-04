package ood.document;

import java.net.URL;

// TODO: Implement the Document
public class VirtualDocument extends AbstractDocument {

  // TODO: Createa  reference to the RealDocument in case we need it.

  public VirtualDocument(String title, URL url) {
    super(title, url);
  }

  // TODO: Initialise the realDocument if required.
  public byte[] retrieveDocument() {
    return null;
  }
}
