package Factory.food.abstractFactory;

public class VegBurger implements Burger{
    @Override
    public void serveBurger() {
        System.out.println("Veg burger served!");
    }
}
