package Prototype.Scaler;

public class ScalerClient {
    public static void fillRegistry(StudentRegistry studentRegistry) {
        Student april21 = new Student();
        april21.setBatch("April 21");
        april21.setPsp(100.0);

        studentRegistry.register("april21", april21);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student std1 = studentRegistry.get("april21");
    }
}
