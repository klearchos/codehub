package ood;

class DecryptAlgorithmBStrategy implements Strategy {

  DecryptAlgorithmBStrategy() {
    System.out.println("Decrypt with Algorithm B");
  }

  @Override
  public String applyAlgorithm(String text) {
    return "Decrypt (B): " + text;
  }
}
