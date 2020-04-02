package BlackMageTests;

import Players.BlackMage.CreatureType;
import Players.BlackMage.SpellType;
import Players.BlackMage.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock(SpellType.SPELL1, CreatureType.DRAGON, 100);
    }

    @Test
    public void canGetSpell() {
        assertEquals(SpellType.SPELL1, warlock.getSpellType());
    }
    
    @Test
    public void canChangeSpell() {
        warlock.setSpellType(SpellType.SPELL2);
        assertEquals(SpellType.SPELL2, warlock.getSpellType());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, warlock.getHealth());
    }

    @Test
    public void canGetCreature() {
        assertEquals(CreatureType.DRAGON, warlock.getCreature());
    }

    @Test
    public void canChangeCreature() {
        warlock.setCreature(CreatureType.MOG);
        assertEquals(CreatureType.MOG, warlock.getCreature());
    }
}
