import Players.Melee.Knight;
import Players.Melee.WeaponType;
import Types.MonsterType;
import Types.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    
    Room room;
    Knight knight;

    @Before
    public void before() {
        room = new Room(TreasureType.GOLD, MonsterType.GOBLIN);
        knight = new Knight(WeaponType.SWORD, 10);
    }

    @Test
    public void canGetTreasure() {
        assertEquals(TreasureType.GOLD, room.getTreasure());
    }

    @Test
    public void canGetMonster() {
        assertEquals(MonsterType.GOBLIN, room.getMonster());
    }

    @Test
    public void startNoPlayers(){
        assertEquals(0, room.getPlayer().size());
    }

    @Test
    public void canAddPlayer(){
        assertEquals(1);
    }




}
