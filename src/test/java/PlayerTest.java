import Players.Melee.Barbarian;
import Players.Melee.WeaponType;
import Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Barbarian(WeaponType.AXE, 100);
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, player.getHealth());
    }

}
