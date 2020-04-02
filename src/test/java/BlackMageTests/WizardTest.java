package BlackMageTests;

import Players.BlackMage.CreatureType;
import Players.BlackMage.SpellType;
import Players.BlackMage.Wizard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard(SpellType.SPELL2, CreatureType.UNICORN, 150);

    }

    @Test
    public void canGet() {
        assertEquals(SpellType.SPELL2, wizard.getSpellType());
    }

    @Test
    public void canChangeSpell() {
        wizard.setSpellType(SpellType.SPELL2);
        assertEquals(SpellType.SPELL2, wizard.getSpellType());
    }

    @Test
    public void canGetHealth() {
        assertEquals(150, wizard.getHealth());
    }

    @Test
    public void canGetCreature(){
        wizard.setCreature(CreatureType.UNICORN);
        assertEquals(CreatureType.UNICORN, wizard.getCreature());
    }
}


