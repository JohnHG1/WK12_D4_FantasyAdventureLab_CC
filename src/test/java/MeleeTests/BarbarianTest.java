package MeleeTests;

import Melee.Barbarian;
import Melee.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian(WeaponType.AXE);
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
}
