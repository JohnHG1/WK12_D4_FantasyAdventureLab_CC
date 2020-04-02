import Players.Melee.Knight;
import Players.Melee.WeaponType;
import Players.Player;
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
        Player player;
        room = new Room(TreasureType.GOLD, MonsterType.GOBLIN, player);
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
        assertEquals(0, room.getPlayer());
    }

    @Test
    public void canAddPlayer(){
        assertEquals(1, room.getPlayer();
    }








}
