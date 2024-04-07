package Factory.example1.abstractFactory;

public class VegPizza implements IPizza {
    @Override
    public void prepare() {
        System.out.println("Adding toppings...");
        System.out.println("Put pizza in oven...");
        System.out.println("VEG PIZZA completed...");
    }
}
