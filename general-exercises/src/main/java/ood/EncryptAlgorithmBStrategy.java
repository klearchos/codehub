package ood;

class EncryptAlgorithmBStrategy implements Strategy {

  EncryptAlgorithmBStrategy() {
    System.out.println("Encrypt with Algorithm B");
  }

  @Override
  public String applyAlgorithm(String text) {
    return "Encrypt (B): " + text;
  }
}
