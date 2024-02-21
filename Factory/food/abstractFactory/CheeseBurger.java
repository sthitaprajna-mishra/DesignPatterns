package Factory.food.abstractFactory;

public class CheeseBurger implements Burger{
    @Override
    public void serveBurger() {
        System.out.println("Cheese burger served!");
    }
}
