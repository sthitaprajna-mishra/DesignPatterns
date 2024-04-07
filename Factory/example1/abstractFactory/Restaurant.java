package Factory.example1.abstractFactory;

public abstract class Restaurant {
    public IBurger orderBurger() {
        IBurger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public IPizza orderPizza() {
        IPizza pizza = createPizza();
        pizza.prepare();
        return pizza;
    }

    public abstract IBurger createBurger();
    public abstract IPizza createPizza();
}
