package Factory.food.abstractFactory;

public abstract class AbstractFactory {
    abstract Pizza getPizza(String pizzaType);
    abstract Burger getBurger(String burgerType);
}
