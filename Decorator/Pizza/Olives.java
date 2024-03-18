package Decorator.Pizza;

public class Olives extends PizzaDecorator{
    Olives(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15.00;
    }
}
