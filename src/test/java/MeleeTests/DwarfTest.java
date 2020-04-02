package MeleeTests;

import Melee.Dwarf;
import Melee.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf(WeaponType.MACE);
    }

    @Test
    public void canGetWeapon() {
        assertEquals(WeaponType.MACE, dwarf.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        dwarf.changeWeapon(WeaponType.AXE);
        assertEquals(WeaponType.SWORD, dwarf.getWeapon());
    }
}
