package Factory.example1.abstractFactory;

public class VegRestaurant extends Restaurant {
    @Override
    public VegBurger createBurger() {
        return new VegBurger();
    }

    @Override
    public VegPizza createPizza() {
        return new VegPizza();
    }
}
