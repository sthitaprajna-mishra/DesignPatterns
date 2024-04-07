package Factory.example1.factoryMethod;

public class Client {
    public static void main(String[] args) {
        VegBurgerRestaurant vegBurgerRestaurant = new VegBurgerRestaurant();
        IBurger vegBurger1 = vegBurgerRestaurant.orderBurger();
        IBurger vegBurger2 = vegBurgerRestaurant.orderBurger();

        ChickenBurgerRestaurant chickenBurgerRestaurant = new ChickenBurgerRestaurant();
        IBurger chickenBurger1 = chickenBurgerRestaurant.orderBurger();
        IBurger chickenBurger2 = chickenBurgerRestaurant.orderBurger();
    }
}
