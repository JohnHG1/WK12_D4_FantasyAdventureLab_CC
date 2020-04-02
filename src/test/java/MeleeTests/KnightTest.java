package MeleeTests;

import Players.Melee.Knight;
import Players.Melee.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before() {
        knight = new Knight(WeaponType.SWORD, 100);
    }

    @Test
    public void canGetWeapon() {
        assertEquals(WeaponType.SWORD, knight.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        knight.changeWeapon(WeaponType.AXE);
        assertEquals(WeaponType.AXE, knight.getWeapon());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, knight.getHealth());
    }
}
