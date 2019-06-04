package ood.personality;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class PersonTester {

  @Test
  public void onePerson() {
    String name = "test";
    Person person = Person.builder().firstName("test").build();
    assertEquals(name, person.getFirstName());
    assertNull(person.getLastName());
  }

  @Test
  public void anotherPerson() {
    String firstName = "first";
    String lastName = "last";
    int power = 5;
    Person person = Person.builder()
        .firstName(firstName)
        // TODO: Uncomment these as soon as you complete the basic steps
//        .lastName(lastName)
//        .power(power)
        .build();
    assertEquals(firstName, person.getFirstName());
    assertEquals(lastName, person.getLastName());
    assertEquals(power, person.getPower());
    assertEquals(0, person.getAge());
  }
}
