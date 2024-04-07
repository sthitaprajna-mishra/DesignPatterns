package Prototype.example1.type2;

public abstract class Vehicle {
    public String brand;
    public String colour;
    public String model;

    public Vehicle() {}

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.colour = vehicle.colour;
        this.model = vehicle.model;
    }

    public abstract Vehicle clone();
}
