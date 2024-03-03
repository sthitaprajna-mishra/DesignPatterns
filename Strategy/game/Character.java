package Strategy.game;

public abstract class Character {
    IWeaponBehaviour weapon;

    public void setWeapon(IWeaponBehaviour weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();
}
