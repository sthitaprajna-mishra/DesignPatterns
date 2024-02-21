package Factory.food.abstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory burgerFactory = FactoryProducer.getFactory("burger");
        Burger vegBurger = burgerFactory.getBurger("veg");
        vegBurger.serveBurger();
        Burger cheeseBurger = burgerFactory.getBurger("cheese");
        cheeseBurger.serveBurger();

        AbstractFactory pizzaFactory = FactoryProducer.getFactory("pizza");
        Pizza pepperoniPizza = pizzaFactory.getPizza("pepperoni");
        pepperoniPizza.servePizza();
        Pizza margheritaPizza = pizzaFactory.getPizza("margherita");
        margheritaPizza.servePizza();
    }
}
