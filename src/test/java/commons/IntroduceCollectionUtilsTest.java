package commons;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import org.junit.Test;

public class IntroduceCollectionUtilsTest {

  @Test
  public void findCommonEmployees() {
    IntroduceCollectionUtils icu = new IntroduceCollectionUtils();
    Collection<Employee> result = icu
        .findCommonEmployees(icu.getEmployeesFor(IntroduceCollectionUtils.C1_NAME), icu.getEmployeesFor(
            IntroduceCollectionUtils.C2_NAME));
    assertEquals(1, result.size());
  }

  @Test
  public void collateEmployeesNoDuplicates() {
    IntroduceCollectionUtils icu = new IntroduceCollectionUtils();
    Collection<Employee> result = icu
        .collateEmployeesNoDuplicates(icu.getEmployeesFor(IntroduceCollectionUtils.C1_NAME), icu.getEmployeesFor(
            IntroduceCollectionUtils.C2_NAME));
    assertEquals(7, result.size());
  }

  @Test
  public void transformToContractors() {
    IntroduceCollectionUtils icu = new IntroduceCollectionUtils();
    Collection<Contractor> result = icu.transformToContractors(icu.getEmployeesFor(
        IntroduceCollectionUtils.C1_NAME));
    assertEquals(3, result.size());
  }
}
