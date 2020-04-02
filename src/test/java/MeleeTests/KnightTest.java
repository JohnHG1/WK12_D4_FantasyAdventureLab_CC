package MeleeTests;

import Melee.Knight;
import Melee.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before() {
        knight = new Knight(WeaponType.SWORD);
    }

    @Test
    public void canGetWeapon() {
        assertEquals(WeaponType.SWORD, knight.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        knight.changeWeapon(WeaponType.AXE);
        assertEquals(WeaponType.MACE, knight.getWeapon());
    }
}
