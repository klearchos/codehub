package ood.converter;

public class UpperCaseConverter extends Converter {

  protected UpperCaseConverter(Converter next) {
    super(next);
  }

  @Override
  public void handle(Object object) {
    if (object instanceof String) {
      System.out.println("Uppercase: " + ((String) object).toUpperCase());
    }
    super.handle(object);
  }
}
