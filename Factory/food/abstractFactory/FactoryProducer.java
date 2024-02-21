package Factory.food.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("burger")) {
            return new BurgerFactory();
        }
        if(factoryType.equalsIgnoreCase("pizza")) {
            return new PizzaFactory();
        }
        return null;
    }
}
