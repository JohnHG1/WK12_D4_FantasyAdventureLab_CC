package Melee;

public abstract class Melee {

    private WeaponType weapon;

    public Melee (WeaponType weapon) {
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void changeWeapon(WeaponType newWeapon) {
        this.weapon = newWeapon;
    }
}
