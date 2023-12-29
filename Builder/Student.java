package Builder;

public class Student {
    int id;
    String name;
    double psp;
    int gradYear;
    String univName;

    private Student(Builder builder) {
        this.name = builder.getName();
        this.gradYear = builder.getGradYear();
        this.psp = builder.getPsp();
        this.univName = builder.getUnivName();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        int id;
        String name;
        double psp;
        int gradYear;
        String univName;

        public Student build() {
            if(this.gradYear > 2023) {
                throw new IllegalArgumentException();
            }
            return new Student(this);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }
    }
}
