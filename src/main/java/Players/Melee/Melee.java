package Players.Melee;

import Players.Player;

public abstract class Melee extends Player {

    private WeaponType weapon;
    private int health;

    public Melee (WeaponType weapon, int health) {
        this.weapon = weapon;
        this.health = health;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void changeWeapon(WeaponType newWeapon) {
        this.weapon = newWeapon;
    }

    public int getHealth() {
        return health;
    }

}
