package Factory.food.factoryMethod;

public class VegPizza implements Pizza{
    @Override
    public void servePizza() {
        System.out.println("Veg pizza served!");
    }
}
