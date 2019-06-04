package ood.personality;

public class GameApp {

  public static void main(String[] args) {
    new GameApp();
  }

  public GameApp() {
    Person person = Person.builder()
        .firstName("George")
        .lastName("Papadopoulos")
        .age(25)
        .dedication(5)
        .power(9)
        .build();
    System.out.println(person);

    Person anotherPerson = Person.builder()
        .firstName("Christina")
        .lastName("Galata")
        .age(45)
        .dedication(8)
        .honesty(10)
        .power(3)
        .build();
    System.out.println(anotherPerson);
  }
}
