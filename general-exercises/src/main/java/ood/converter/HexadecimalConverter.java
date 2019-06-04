package ood.converter;

public class HexadecimalConverter extends AbstractConverter {

  protected HexadecimalConverter(AbstractConverter next) {
    super(next);
  }

  @Override
  public void handle(Object object) {
    if (object instanceof Integer) {
      System.out.println("Hexadecimal: " + Integer.toHexString((int)object));
    }
    super.handle(object);
  }
}
