package Factory.example1.abstractFactory;

public class Client {
    public static void main(String[] args) {
        VegRestaurant vegRestaurant = new VegRestaurant();
        IBurger vegBurger1 = vegRestaurant.orderBurger();
        IBurger vegBurger2 = vegRestaurant.orderBurger();
        IPizza vegPizza1 = vegRestaurant.orderPizza();

        ChickenRestaurant chickenRestaurant = new ChickenRestaurant();
        IBurger chickenBurger1 = chickenRestaurant.orderBurger();
        IBurger chickenBurger2 = chickenRestaurant.orderBurger();
        IPizza chickenPizza1 = chickenRestaurant.orderPizza();
    }
}
