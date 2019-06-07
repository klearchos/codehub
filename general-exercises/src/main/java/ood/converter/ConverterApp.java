package ood.converter;

public class ConverterApp {

  public static void main(String[] args) {
    new ConverterApp();
  }

  public ConverterApp() {
    Converter upperCaseConverter = new UpperCaseConverter(null);
    Converter binaryConverter = new BinaryConverter(upperCaseConverter);
    Converter octalConverter = new OctalConverter(binaryConverter);
    Converter hexadecimalConverter = new HexadecimalConverter(octalConverter);

    hexadecimalConverter.handle(36);
    hexadecimalConverter.handle("Test");
  }
}
