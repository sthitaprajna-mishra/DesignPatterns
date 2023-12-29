package Builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setName("Mohit");
//        builder.setPsp(80.6);
//        builder.setGradYear(2020);
//
//        Student s = builder.build();
//        Student s = new Student(builder);
//        System.out.println(s);

        Student s1 = Student.getBuilder()
                .setName("Mohit")
                .setPsp(80.6)
                .setGradYear(2020)
                .build();

        System.out.println(s1);
    }
}
