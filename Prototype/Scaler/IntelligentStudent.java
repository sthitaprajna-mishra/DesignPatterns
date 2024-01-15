package Prototype.Scaler;

public class IntelligentStudent extends Student {
    int iq;

    IntelligentStudent() {}
    IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
