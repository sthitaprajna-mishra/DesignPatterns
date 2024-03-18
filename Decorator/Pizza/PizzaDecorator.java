package Decorator.Pizza;

public abstract class PizzaDecorator implements IPizza{
    IPizza decoratedPizza;

    PizzaDecorator(IPizza pizza) {
        this.decoratedPizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.decoratedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return this.decoratedPizza.getCost();
    }
}
