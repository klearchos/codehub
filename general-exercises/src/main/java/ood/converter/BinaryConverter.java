package ood.converter;

public class BinaryConverter extends Converter {

  protected BinaryConverter(Converter next) {
    super(next);
  }

  @Override
  public void handle(Object object) {
    if (object instanceof Integer) {
      System.out.println("Binary: " + Integer.toBinaryString((int)object));
    }
    super.handle(object);
  }
}
