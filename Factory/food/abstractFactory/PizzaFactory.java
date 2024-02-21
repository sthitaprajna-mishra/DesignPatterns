package Factory.food.abstractFactory;

public class PizzaFactory extends AbstractFactory{
    public Pizza getPizza(String pizzaType) {
        if(pizzaType.equalsIgnoreCase("veg")) {
            return new VegPizza();
        }
        if(pizzaType.equalsIgnoreCase("pepperoni")) {
            return new PepperoniPizza();
        }
        if(pizzaType.equalsIgnoreCase("margherita")) {
            return new MargheritaPizza();
        }
        return null;
    }
    Burger getBurger(String burgerType) {
        return null;
    }
}
