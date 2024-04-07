package Factory.example1.abstractFactory;

public class ChickenBurger implements IBurger {
    @Override
    public void prepare() {
        System.out.println("Cooking chicken");
        System.out.println("Preparing CHICKEN burger...");
        System.out.println("CHICKEN burger preparation completed.");
    }
}
