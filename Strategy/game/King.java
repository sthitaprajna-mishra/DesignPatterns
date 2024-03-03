package Strategy.game;

public class King extends Character{
    King() {
        weapon = new BowAndArrowBehaviour();
    };

    @Override
    public void fight() {
        System.out.println("I am a king and this is how I fight - ");
        weapon.useWeapon();
    }
}
