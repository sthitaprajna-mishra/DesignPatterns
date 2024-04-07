package Prototype.example1.type2;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    Map<String, Vehicle> repo = new HashMap<>();

    public VehicleRepository() {
        Car car1 = new Car();
        car1.topSpeed = 200;
        car1.gps = new GpsSystem("56.767574564564", "246.453532232342");
        car1.brand = "BMW";
        car1.model = "XSR 5";
        car1.colour = "Charcoal Black";

        Bus bus1 = new Bus();
        bus1.doors = 2;
        car1.brand = "Mercedes";
        car1.model = "X2S";
        car1.colour = "Pearl White";

        repo.put("car", car1);
        repo.put("bus", bus1);
    }

    public Vehicle getVehicle(String obj) {
        return repo.get(obj).clone();
    }
}
