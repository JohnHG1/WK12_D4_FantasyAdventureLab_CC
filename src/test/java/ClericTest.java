import Players.Cleric;
import Types.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before() {
        cleric = new Cleric(HealingTool.HERBS, 100);
    }

    @Test
    public void canGetTool() {
        assertEquals(HealingTool.HERBS, cleric.getTool());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, cleric.getHealth());
    }

    @Test
    public void canChangeTool() {
        cleric.changeTool(HealingTool.FIRSTAIDKIT);
        assertEquals(HealingTool.FIRSTAIDKIT, cleric.getTool());
    }
}
