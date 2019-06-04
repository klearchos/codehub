package ood.personality;

public class Person {

  private final String firstName;
  private final String lastName;
  private final int age;
  private final int power;
  private final int reliability;
  private final int honesty;
  private final int dedication;
  private final int speed;

  public Person(String firstName, String lastName, int age, int power, int reliability, int honesty,
      int dedication, int speed) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.power = power;
    this.reliability = reliability;
    this.honesty = honesty;
    this.dedication = dedication;
    this.speed = speed;
  }

  // TODO: Return a PersonBuilder instance
  public static PersonBuilder builder() {
    return null;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public int getPower() {
    return power;
  }

  public int getReliability() {
    return reliability;
  }

  public int getHonesty() {
    return honesty;
  }

  public int getDedication() {
    return dedication;
  }

  public int getSpeed() {
    return speed;
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", power=" + power +
        ", reliability=" + reliability +
        ", honesty=" + honesty +
        ", dedication=" + dedication +
        ", speed=" + speed +
        '}';
  }
}
