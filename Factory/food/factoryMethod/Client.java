package Factory.food.factoryMethod;

public class Client {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza margheritaPizza = pizzaFactory.getPizza("margherita");
        margheritaPizza.servePizza();

        Pizza vegPizza = pizzaFactory.getPizza("veg");
        vegPizza.servePizza();

        Pizza pepperoniPizza = pizzaFactory.getPizza("pepperoni");
        pepperoniPizza.servePizza();
    }
}
