package Factory.food.factoryMethod;

public class PizzaFactory {
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
}
