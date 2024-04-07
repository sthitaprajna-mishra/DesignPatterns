package Factory.example1.abstractFactory;

public class ChickenRestaurant extends Restaurant {
    @Override
    public ChickenBurger createBurger() {
        return new ChickenBurger();
    }

    @Override
    public ChickenTikkaPizza createPizza() {
        return new ChickenTikkaPizza();
    }
}