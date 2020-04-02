package MeleeTests;

import Players.Melee.Barbarian;
import Players.Melee.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian(WeaponType.AXE, 100);
    }

    @Test
    public void canGetWeapon() {
        assertEquals(WeaponType.AXE, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        barbarian.changeWeapon(WeaponType.SWORD);
        assertEquals(WeaponType.SWORD, barbarian.getWeapon());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, barbarian.getHealth());
    }
}
