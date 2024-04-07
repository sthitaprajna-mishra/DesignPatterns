package Prototype.example1.type2;

public class Car extends Vehicle {
    public int topSpeed;
    public GpsSystem gps;

    public Car() {}

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
        this.gps = car.gps.clone(); // deep copy
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
