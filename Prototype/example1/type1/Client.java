package Prototype.example1.type1;

public class Client {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.topSpeed = 200;
        car1.brand = "BMW";
        car1.model = "XSR 5";
        car1.colour = "Charcoal Black";

        Car car2 = car1.clone(); // car1;

        System.out.println(car1);
        System.out.println(car2);
    }
}
