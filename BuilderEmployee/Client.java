package BuilderEmployee;

public class Client {
    public static void main(String[] args) {
        Employee employee = Employee.getBuilder()
                .setFirstName("John")
                .setMiddleName("Kramer")
                .setLastName("Wild")
                .setCountry("USA")
                .build();

        System.out.println(employee.toString());

    }
}
