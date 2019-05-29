package commons;

public class Contractor {

  private String firstName;
  private String lastName;
  private String city;
  private String jobTitle;
  private int hourlyPayRate;

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

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public int getHourlyPayRate() {
    return hourlyPayRate;
  }

  public void setHourlyPayRate(int hourlyPayRate) {
    this.hourlyPayRate = hourlyPayRate;
  }

  @Override
  public String toString() {
    return "Contractor{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", city='" + city + '\'' +
        ", jobTitle='" + jobTitle + '\'' +
        ", hourlyPayRate=" + hourlyPayRate +
        '}';
  }
}
