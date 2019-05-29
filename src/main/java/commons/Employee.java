package commons;

// TODO: Implement Comparable<Employee>
// Use the firstName and if this is equal then check by the monthly salary
public class Employee {

  private String firstName;
  private String lastName;
  private int monthlyIncome;

  public Employee(String firstName, String lastName, int monthlyIncome) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.monthlyIncome = monthlyIncome;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getMonthlyIncome() {
    return monthlyIncome;
  }

  public void setMonthlyIncome(int monthlyIncome) {
    this.monthlyIncome = monthlyIncome;
  }
}
