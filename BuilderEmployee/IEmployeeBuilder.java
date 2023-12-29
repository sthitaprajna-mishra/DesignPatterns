package BuilderEmployee;

public interface IEmployeeBuilder {
    IEmployeeBuilder setFirstName(String firstName);
    IEmployeeBuilder setMiddleName(String middleName);
    IEmployeeBuilder setLastName(String lastName);
    IEmployeeBuilder setSalary(int salary);
    IEmployeeBuilder setTotalYearsOfExperience(double totalYearsOfExperience);
    IEmployeeBuilder setJobTitle(JobTitle jobTitle);
    IEmployeeBuilder setPrimaryEmailAddress(String primaryEmailAddress);
    IEmployeeBuilder setRecoveryEmailAddress(String recoveryEmailAddress);
    IEmployeeBuilder setAddress(String address);
    IEmployeeBuilder setCountry(String country);
}
