package ood.converter;

public abstract class AbstractConverter {

  private final AbstractConverter next;

  protected AbstractConverter(AbstractConverter next) {
    this.next = next;
  }

  public void handle(Object object) {
    if (next != null) {
      next.handle(object);
    }
  }
}
