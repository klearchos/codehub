package ood.enigma;

class Application {

  private static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

  public static void main(String[] args) {
    new Application();
  }

  Application() {
    EnigmaMachine enigmaMachine = new EnigmaMachine();
    enigmaMachine.setMode(EnigmaMode.ENCRYPT_A);
    String encrypted = enigmaMachine.applyAlgorithm(TEXT);
    System.out.println(encrypted);
    enigmaMachine.setMode(EnigmaMode.ENCRYPT_B);
    encrypted = enigmaMachine.applyAlgorithm(encrypted);
    System.out.println(encrypted);
    enigmaMachine.setMode(EnigmaMode.ENCRYPT_C);
    encrypted = enigmaMachine.applyAlgorithm(encrypted);
    System.out.println(encrypted);

    enigmaMachine.setMode(EnigmaMode.DECRYPT_C);
    String decrypted = enigmaMachine.applyAlgorithm(encrypted);
    System.out.println(decrypted);
    enigmaMachine.setMode(EnigmaMode.DECRYPT_B);
    decrypted = enigmaMachine.applyAlgorithm(decrypted);
    System.out.println(decrypted);
    enigmaMachine.setMode(EnigmaMode.DECRYPT_A);
    decrypted = enigmaMachine.applyAlgorithm(decrypted);
    System.out.println(decrypted);
  }
}
