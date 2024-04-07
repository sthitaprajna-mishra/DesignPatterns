package Factory.example1.factoryMethod;

public class VegBurgerRestaurant extends Restaurant {
    @Override
    public VegBurger createBurger() {
        return new VegBurger();
    }
}
