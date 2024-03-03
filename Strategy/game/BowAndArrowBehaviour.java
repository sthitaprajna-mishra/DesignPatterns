package Strategy.game;

public class BowAndArrowBehaviour implements IWeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Shot with an arrow!");
    }
}
