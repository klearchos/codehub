package ood.converter;

public class ConverterApp {

  public static void main(String[] args) {
    new ConverterApp();
  }

  public ConverterApp() {
    AbstractConverter upperCaseConverter = new UpperCaseConverter(null);
    AbstractConverter binaryConverter = new BinaryConverter(upperCaseConverter);
    AbstractConverter octalConverter = new OctalConverter(binaryConverter);
    AbstractConverter hexadecimalConverter = new HexadecimalConverter(octalConverter);

    hexadecimalConverter.handle(36);
    hexadecimalConverter.handle("Test");
  }
}
