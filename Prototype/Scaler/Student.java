package Prototype.Scaler;

public class Student implements IPrototype<Student> {
    int id;
    String name;
    String batch;
    double psp;

    Student() {}

    Student(Student student) {
        this.setId(student.id);
        this.setName(student.name);
        this.setBatch(student.batch);
        this.setPsp(student.psp);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
