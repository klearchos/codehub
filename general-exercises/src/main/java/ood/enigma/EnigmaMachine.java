package ood.enigma;

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
      case ENCRYPT_B:
        algorithm = new EncryptAlgorithmBStrategy();
        break;
      case DECRYPT_B:
        algorithm = new DecryptAlgorithmBStrategy();
        break;
      case ENCRYPT_C:
        algorithm = new EncryptAlgorithmCStrategy();
        break;
      case DECRYPT_C:
        algorithm = new DecryptAlgorithmCStrategy();
        break;
    }
  }

  String applyAlgorithm(String text) {
    return algorithm.applyAlgorithm(text);
  }
}
