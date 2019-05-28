package ood;

class EnigmaMachine {

  private Strategy algorithm;

  void setMode(EnigmaMode mode) {
    switch (mode) {
      case ENCRYPT_A:
        algorithm = new EncryptAlgorithmAStrategy();
        break;
      case DECRYPT_A:
        algorithm = new DecryptAlgorithmAStrategy();
        break;
    }
  }

  String applyAlgorithm(String text) {
    return algorithm.applyAlgorithm(text);
  }
}
