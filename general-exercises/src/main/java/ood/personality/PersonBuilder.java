package ood.personality;

public final class PersonBuilder {

  private String firstName;
  private String lastName;
  private int age;
  private int power;
  private int reliability;
  private int honesty;
  private int dedication;
  private int speed;

  PersonBuilder() {}

  PersonBuilder firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  PersonBuilder lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  PersonBuilder age(int age) {
    this.age = age;
    return this;
  }

  PersonBuilder power(int power) {
    this.power = power;
    return this;
  }

  PersonBuilder reliability(int reliability) {
    this.reliability = reliability;
    return this;
  }

  PersonBuilder honesty(int honesty) {
    this.honesty = honesty;
    return this;
  }

  PersonBuilder dedication(int dedication) {
    this.dedication = dedication;
    return this;
  }

  PersonBuilder speed(int speed) {
    this.speed = speed;
    return this;
  }

  public Person build() {
    return new Person(firstName, lastName, age, power, reliability, honesty,
        dedication, speed );
  }
}
