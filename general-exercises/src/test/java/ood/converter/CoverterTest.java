package ood.converter;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class CoverterTest {

  AbstractConverter upperCaseConverter;
  AbstractConverter binaryConverter;
  AbstractConverter octalConverter;
  AbstractConverter hexadecimalConverter;

  @Before
  public void setupChain() {
    upperCaseConverter = mock(UpperCaseConverter.class);
    binaryConverter = new BinaryConverter(upperCaseConverter);
    octalConverter = new OctalConverter(binaryConverter);
    hexadecimalConverter = new HexadecimalConverter(octalConverter);
  }

  @Test
  public void checkChain() {
    hexadecimalConverter.handle(36);
    hexadecimalConverter.handle(37);
    hexadecimalConverter.handle("Test");

    verify(upperCaseConverter, times(3)).handle(any());
  }

}
