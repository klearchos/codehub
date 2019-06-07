package ood.converter;

public class HexadecimalConverter extends Converter {

  protected HexadecimalConverter(Converter next) {
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
