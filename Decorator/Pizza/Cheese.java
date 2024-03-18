package Decorator.Pizza;

public class Cheese extends PizzaDecorator{
    Cheese(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 20.00;
    }
}
