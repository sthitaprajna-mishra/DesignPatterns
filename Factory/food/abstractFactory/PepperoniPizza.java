package Factory.food.abstractFactory;

public class PepperoniPizza implements Pizza {
    @Override
    public void servePizza() {
        System.out.println("Pepperoni pizza served!");
    }
}
