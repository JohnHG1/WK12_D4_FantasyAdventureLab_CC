import Players.Melee.Barbarian;
import Players.Melee.WeaponType;
import Players.Player;
import Types.MonsterType;
import Types.TreasureType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player;
    ArrayList<Room> rooms;
    Room room1;

    @Before
    public void before() {
        player = new Barbarian(WeaponType.AXE, 100);
        rooms = new ArrayList<Room>();
        room1 = new Room(TreasureType.GEMS, MonsterType.GOBLIN, null);
        rooms.add(room1);
        game = new Game(player, rooms);
    }

    @Test
    public void canGetPlayer() {
        assertEquals(player, game.getPlayer());
    }

    @Test
    public void canGetRooms() {
        assertEquals(0, game.getRooms());
    }
}
