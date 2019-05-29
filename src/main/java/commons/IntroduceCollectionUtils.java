package commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

class IntroduceCollectionUtils {

  public static final String C1_NAME = "Foo";
  public static final String C2_NAME = "Bar";

  public static void main(String[] args) {
    new IntroduceCollectionUtils();
  }

  IntroduceCollectionUtils() {
  }

  public Collection<Employee> findCommonEmployees(List<Employee> list1, List<Employee> list2) {
    return CollectionUtils.intersection(list1, list2);
  }

  public List<Employee> collateEmployeesNoDuplicates(List<Employee> list1, List<Employee> list2) {
    Collections.sort(list1);
    Collections.sort(list2);
    return CollectionUtils.collate(list1, list2, false);
  }

  public Collection<Contractor> transformToContractors(List<Employee> list1) {
    return CollectionUtils.collect(list1,
        employee -> {
          Contractor contractor = new Contractor();
          contractor.setFirstName(employee.getFirstName());
          contractor.setLastName(employee.getLastName());
          contractor.setHourlyPayRate(employee. getMonthlyIncome() / 240);
          contractor.setJobTitle("default value");
          return contractor;
        });
  }

  public List<Employee> getEmployeesFor(String name) {
    List<Employee> employees = new ArrayList<>();

    if (name.equals(C1_NAME)) {
      Employee e1 = new Employee("name_1", "last_1", 2500);
      Employee e2 = new Employee("name_2", "last_2", 800);
      Employee e3 = new Employee("name_3", "last_3", 1500);
      employees.add(e2);
      employees.add(e1);
      employees.add(e3);
    } else {
      Employee e1 = new Employee("name_1", "last_1", 1500);
      Employee e2 = new Employee("name_2", "last_2", 800);
      Employee e4 = new Employee("name_4", "last_4", 900);
      Employee e5 = new Employee("name_5", "last_5", 1200);
      Employee e6 = new Employee("name_6", "last_6", 5000);
      employees.add(e6);
      employees.add(e2);
      employees.add(e1);
      employees.add(e4);
      employees.add(e5);
    }
    return employees;
  }
}
