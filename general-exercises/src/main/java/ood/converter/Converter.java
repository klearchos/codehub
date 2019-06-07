package ood.converter;

public class Converter {

  private final Converter next;

  protected Converter(Converter next) {
    this.next = next;
  }

  public void handle(Object object) {
    if (next != null) {
      next.handle(object);
    }
  }
}
