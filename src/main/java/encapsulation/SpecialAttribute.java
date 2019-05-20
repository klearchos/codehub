package encapsulation;

// TODO: Do any necessary changes
public class SpecialAttribute {

  private String name;
  private String value;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SpecialAttribute{" +
        "name='" + name + '\'' +
        ", value='" + value + '\'' +
        '}';
  }
}
