package ood.converter;

public class OctalConverter extends Converter {

  protected OctalConverter(Converter next) {
    super(next);
  }

  @Override
  public void handle(Object object) {
    if (object instanceof Integer) {
      System.out.println("Octal: " + Integer.toOctalString((int)object));
    }
    super.handle(object);
  }
}
