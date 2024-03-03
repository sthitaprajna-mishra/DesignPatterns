package Strategy.game;

public class Queen extends Character{
    Queen() {
        weapon = new KnifeBehaviour();
    };

    @Override
    public void fight() {
        System.out.println("I am a queen and this is how I fight - ");
        weapon.useWeapon();
    }
}
