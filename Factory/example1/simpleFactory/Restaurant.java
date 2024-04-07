package Factory.example1.simpleFactory;

public class Restaurant {
    public IBurger orderBurger(String orderRequest) {
        IBurger burger = null;

        if(orderRequest.equalsIgnoreCase("veg")) {
            burger = new VegBurger();
        }
        else if(orderRequest.equalsIgnoreCase("chicken")) {
            burger = new ChickenBurger();
        }

        burger.prepare();

        return burger;
    }
}
