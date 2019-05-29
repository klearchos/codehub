package commons;

import static org.junit.Assert.assertTrue;

import java.util.Collection;
import org.junit.Test;

public class IntroduceCollectionUtilsTest {

  @Test
  public void findCommonEmployees() {
    IntroduceCollectionUtils icu = new IntroduceCollectionUtils();
    Collection<Employee> result = icu
        .findCommonEmployees(icu.getEmployeesFor(icu.C1_NAME), icu.getEmployeesFor(icu.C2_NAME));
    assertTrue(result.size() == 1);
  }

  @Test
  public void collateEmployeesNoDuplicates() {
    IntroduceCollectionUtils icu = new IntroduceCollectionUtils();
    Collection<Employee> result = icu
        .collateEmployeesNoDuplicates(icu.getEmployeesFor(icu.C1_NAME), icu.getEmployeesFor(icu.C2_NAME));
    assertTrue(result.size() == 7);
  }

  @Test
  public void transformToContractors() {
    IntroduceCollectionUtils icu = new IntroduceCollectionUtils();
    Collection<Contractor> result = icu.transformToContractors(icu.getEmployeesFor(icu.C1_NAME));
    assertTrue(result.size() == 3);
  }
}
