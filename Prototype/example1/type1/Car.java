package Prototype.example1.type1;

public class Car implements IPrototype {
    public String brand;
    public String colour;
    public String model;
    public int topSpeed;

    public Car() {}

    public Car(Car carObject) {
        this.brand = carObject.brand;
        this.colour = carObject.colour;
        this.model = carObject.model;
        this.topSpeed = carObject.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
