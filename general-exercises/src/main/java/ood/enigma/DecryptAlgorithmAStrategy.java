package ood.enigma;

class DecryptAlgorithmAStrategy implements Strategy {

  DecryptAlgorithmAStrategy() {
    System.out.println("Decrypt with Algorithm A");
  }

  @Override
  public String applyAlgorithm(String text) {
    return "Decrypt (A): " + text;
  }
}
