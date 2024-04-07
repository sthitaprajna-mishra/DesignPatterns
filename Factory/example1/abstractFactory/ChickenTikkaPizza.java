package Factory.example1.abstractFactory;

public class ChickenTikkaPizza implements IPizza {
    @Override
    public void prepare() {
        System.out.println("Adding chicken pieces...");
        System.out.println("Put pizza in oven...");
        System.out.println("CHICKEN TIKKA PIZZA completed...");
    }
}
