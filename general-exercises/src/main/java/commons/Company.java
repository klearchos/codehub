package commons;

import java.util.ArrayList;
import java.util.List;

public class Company {

  public Company(String name) {
    this.name = name;
  }

  private String name;
  private List<Contractor> contractors = new ArrayList<>();
  private List<Employee> employees = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Contractor> getContractors() {
    return contractors;
  }

  public void setContractors(List<Contractor> contractors) {
    this.contractors = contractors;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  @Override
  public String toString() {
    return "Company{" +
        "name='" + name + '\'' +
        ", contractors=" + contractors +
        ", employees=" + employees +
        '}';
  }
}
