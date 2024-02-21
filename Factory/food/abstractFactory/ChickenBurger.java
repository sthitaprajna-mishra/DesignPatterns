package Factory.food.abstractFactory;

public class ChickenBurger implements Burger{
    @Override
    public void serveBurger() {
        System.out.println("Chicken burger served!");
    }
}
