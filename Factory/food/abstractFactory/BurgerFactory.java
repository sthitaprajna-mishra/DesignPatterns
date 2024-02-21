package Factory.food.abstractFactory;

public class BurgerFactory extends AbstractFactory{
    public Burger getBurger(String burgerType) {
        if(burgerType.equalsIgnoreCase("veg")) {
            return new VegBurger();
        }
        if(burgerType.equalsIgnoreCase("cheese")) {
            return new CheeseBurger();
        }
        if(burgerType.equalsIgnoreCase("chicken")) {
            return new ChickenBurger();
        }
        return null;
    }
    Pizza getPizza(String pizzaType)  {
        return null;
    }
}
