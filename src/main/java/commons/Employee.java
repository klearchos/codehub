package commons;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Employee implements Comparable<Employee> {

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

  @Override
  public String toString() {
    return "Employee{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", monthlyIncome=" + monthlyIncome +
        '}';
  }

  @Override
  public int compareTo(Employee o) {
    int firstNameComp = this.getFirstName().compareTo(o.getFirstName());
    if (firstNameComp == 0) {
      // Check by monthly salary
      if (this.getMonthlyIncome() > o.getMonthlyIncome()) {
        return 1;
      } else if(this.getMonthlyIncome() < o.getMonthlyIncome()) {
        return -1;
      } else {
        return 0;
      }
    } else {
      return firstNameComp;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Employee employee = (Employee) o;

    return new EqualsBuilder()
        .append(monthlyIncome, employee.monthlyIncome)
        .append(firstName, employee.firstName)
        .append(lastName, employee.lastName)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(firstName)
        .append(lastName)
        .append(monthlyIncome)
        .toHashCode();
  }
}
