package Strategy.game;

public class KnifeBehaviour implements IWeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Stabbed with a knife!");
    }
}
