package BuilderEmployee;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int salary;
    private double totalYearsOfExperience;
    private JobTitle jobTitle;
    private String primaryEmailAddress;
    private String recoveryEmailAddress;
    private String address;
    private String country;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public double getTotalYearsOfExperience() {
        return totalYearsOfExperience;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public String getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    public String getRecoveryEmailAddress() {
        return recoveryEmailAddress;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    private Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.firstName;
        this.middleName = employeeBuilder.middleName;
        this.lastName = employeeBuilder.lastName;
        this.salary = employeeBuilder.salary;
        this.totalYearsOfExperience = employeeBuilder.totalYearsOfExperience;
        this.jobTitle = employeeBuilder.jobTitle;
        this.primaryEmailAddress = employeeBuilder.primaryEmailAddress;
        this.recoveryEmailAddress = employeeBuilder.recoveryEmailAddress;
        this.address = employeeBuilder.address;
        this.country = employeeBuilder.country;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", totalYearsOfExperience=" + totalYearsOfExperience +
                ", jobTitle=" + jobTitle +
                ", primaryEmailAddress='" + primaryEmailAddress + '\'' +
                ", recoveryEmailAddress='" + recoveryEmailAddress + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class EmployeeBuilder implements IEmployeeBuilder {
        private String firstName;
        private String middleName;
        private String lastName;
        private int salary;
        private double totalYearsOfExperience;
        private JobTitle jobTitle;
        private String primaryEmailAddress;
        private String recoveryEmailAddress;
        private String address;
        private String country;

        public Employee build() {
            return new Employee(this);
        }

        @Override
        public EmployeeBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        public EmployeeBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        @Override
        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public EmployeeBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        @Override
        public EmployeeBuilder setTotalYearsOfExperience(double totalYearsOfExperience) {
            this.totalYearsOfExperience = totalYearsOfExperience;
            return this;
        }

        @Override
        public EmployeeBuilder setJobTitle(JobTitle jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        @Override
        public EmployeeBuilder setPrimaryEmailAddress(String primaryEmailAddress) {
            this.primaryEmailAddress = primaryEmailAddress;
            return this;
        }

        @Override
        public EmployeeBuilder setRecoveryEmailAddress(String recoveryEmailAddress) {
            this.recoveryEmailAddress = recoveryEmailAddress;
            return this;
        }

        @Override
        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        @Override
        public EmployeeBuilder setCountry(String country) {
            this.country = country;
            return this;
        }
    }
}
