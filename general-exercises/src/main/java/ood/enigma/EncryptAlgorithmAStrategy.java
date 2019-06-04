package ood.enigma;

class EncryptAlgorithmAStrategy implements Strategy {

  EncryptAlgorithmAStrategy() {
    System.out.println("Encrypt with Algorithm A");
  }

  @Override
  public String applyAlgorithm(String text) {
    return "Encrypt (A): " + text;
  }
}
