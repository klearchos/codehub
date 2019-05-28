package ood;

class EncryptAlgorithmCStrategy implements Strategy {

  EncryptAlgorithmCStrategy() {
    System.out.println("Encrypt with Algorithm C");
  }

  @Override
  public String applyAlgorithm(String text) {
    return "Encrypt (C): " + text;
  }
}
