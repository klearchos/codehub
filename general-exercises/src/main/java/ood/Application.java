package ood;

public class Application {

  private static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

  public static void main(String[] args) {
    new Application();
  }

  Application() {
    EnigmaMachine enigmaMachine = new EnigmaMachine();
  }
}
