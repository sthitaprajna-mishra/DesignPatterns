package Strategy.game;

public class MaceBehaviour implements IWeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Crushed with a mace!");
    }
}
