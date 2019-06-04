package ood.enigma;

class DecryptAlgorithmCStrategy implements Strategy {

  DecryptAlgorithmCStrategy() {
    System.out.println("Decrypt with Algorithm C");
  }

  @Override
  public String applyAlgorithm(String text) {
    return "Decrypt (C): " + text;
  }
}
