package Factory.example1.factoryMethod;

public class ChickenBurgerRestaurant extends Restaurant {
    @Override
    public ChickenBurger createBurger() {
        return new ChickenBurger();
    }
}