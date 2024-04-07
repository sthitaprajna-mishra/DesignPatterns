package Factory.example1.abstractFactory;

public class VegBurger implements IBurger {
    @Override
    public void prepare() {
        System.out.println("Adding veggies");
        System.out.println("Preparing VEG burger...");
        System.out.println("VEG burger preparation completed.");
    }
}
