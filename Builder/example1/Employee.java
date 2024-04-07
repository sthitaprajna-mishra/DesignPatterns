package Builder.example1;

import java.util.Date;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private int age;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    public String getNationality() {
        return nationality;
    }

    private Date birthDate;
    private int salary;
    private String location;
    private String nationality;

    public Employee(EmployeeBuilder builderObject) {
        this.id = builderObject.getId();
        this.firstName = builderObject.getFirstName();
        this.lastName = builderObject.getLastName();
        this.age = builderObject.getAge();
        this.birthDate = builderObject.getBirthDate();
        this.salary = builderObject.getSalary();
        this.location = builderObject.getLocation();
        this.nationality = builderObject.getNationality();
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        private String id;
        private String firstName;
        private String lastName;
        private int age;
        private Date birthDate;
        private int salary;
        private String location;
        private String nationality;

        public Employee build() {
            return new Employee(this);
        }

        public String getId() {
            return id;
        }

        public EmployeeBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public EmployeeBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public int getAge() {
            return age;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public EmployeeBuilder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public int getSalary() {
            return salary;
        }

        public EmployeeBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public String getLocation() {
            return location;
        }

        public EmployeeBuilder setLocation(String location) {
            this.location = location;
            return this;
        }

        public String getNationality() {
            return nationality;
        }

        public EmployeeBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
    }
}
