package ood;

class Application {

  private static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

  public static void main(String[] args) {
    new Application();
  }

  Application() {
    EnigmaMachine enigmaMachine = new EnigmaMachine();
    enigmaMachine.setMode(EnigmaMode.ENCRYPT_A);
    String encryptedA = enigmaMachine.applyAlgorithm(TEXT);
    System.out.println(encryptedA);
    enigmaMachine.setMode(EnigmaMode.DECRYPT_A);
    String decryptedA = enigmaMachine.applyAlgorithm(encryptedA);
    System.out.println(decryptedA);
  }
}
