import HealingTool.HealingTool;
import Melee.Dwarf;
import Melee.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before() {
        cleric = new Cleric(HealingTool.HERBS);
    }

    @Test
    public void canGetTool() {
        assertEquals("HERBS", cleric.getTool());
    }

    @Test
    public void canChangeWeapon() {
        cleric.changeTool(HealingTool.FIRSTAIDKIT);
        assertEquals("FIRSTAIDKIT", cleric.getTool());
    }
}
