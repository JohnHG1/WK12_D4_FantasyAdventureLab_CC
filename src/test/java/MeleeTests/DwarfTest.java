package MeleeTests;

import Players.Melee.Dwarf;
import Players.Melee.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf(WeaponType.MACE, 100);
    }

    @Test
    public void canGetWeapon() {
        assertEquals(WeaponType.MACE, dwarf.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        dwarf.changeWeapon(WeaponType.AXE);
        assertEquals(WeaponType.AXE, dwarf.getWeapon());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, dwarf.getHealth());
    }
}
