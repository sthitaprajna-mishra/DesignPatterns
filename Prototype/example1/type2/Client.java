package Prototype.example1.type2;

public class Client {
    public static void main(String[] args) {
        VehicleRepository repo = new VehicleRepository();
        Vehicle car1 = repo.getVehicle("car");
        Vehicle car2 = repo.getVehicle("car");

        Vehicle bus1 = repo.getVehicle("bus");
        Vehicle bus2 = repo.getVehicle("bus");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(bus1);
        System.out.println(bus2);
    }
}
