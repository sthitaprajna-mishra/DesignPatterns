package Factory.example1.factoryMethod;

public abstract class Restaurant {
    public IBurger orderBurger() {
        IBurger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract IBurger createBurger();
}
