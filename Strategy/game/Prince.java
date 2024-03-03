package Strategy.game;

public class Prince extends Character{
    Prince() {
        weapon = new MaceBehaviour();
    }
    @Override
    public void fight() {
        System.out.println("I am a prince and this is how I fight - ");
        weapon.useWeapon();
    }
}
