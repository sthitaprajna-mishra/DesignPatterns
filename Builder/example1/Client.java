package Builder.example1;

public class Client {
    public static void main(String[] args) {
        Employee rajesh = Employee.getBuilder()
                .setId("1")
                .setAge(24)
                .setFirstName("Rajesh")
                .setLocation("Koothrapalli")
                .setNationality("Indian")
                .build();

        Employee sheldon = Employee.getBuilder()
                .setId("2")
                .setAge(26)
                .setFirstName("Sheldon")
                .setLastName("Cooper")
                .setSalary(600000)
                .build();

        Employee penny = Employee.getBuilder()
                .setId("3")
                .setAge(23)
                .setFirstName("Penny")
                .build();

        System.out.println(rajesh.getBirthDate());

        System.out.println(sheldon.getSalary());

        System.out.println(penny.getSalary());
    }
}
