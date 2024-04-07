package Prototype.example1.type2;

public class Bus extends Vehicle {
    public int doors;

    public Bus() {}

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

}
