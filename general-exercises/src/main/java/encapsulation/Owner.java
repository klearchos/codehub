package encapsulation;

import java.io.Serializable;

public class Owner implements Serializable {

  private static final long serialVersionUID = 51247468L;

  private String name;
  private String surname;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  @Override
  public String toString() {
    return "Owner{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        '}';
  }
}
