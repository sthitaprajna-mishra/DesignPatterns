package Factory.food.factoryMethod;

public class MargheritaPizza implements Pizza{
    @Override
    public void servePizza() {
        System.out.println("Margherita pizza served!");
    }
}
