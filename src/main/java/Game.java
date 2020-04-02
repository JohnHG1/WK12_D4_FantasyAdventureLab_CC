import Players.Player;

import java.util.ArrayList;

public class Game {

    private Player player;
    private ArrayList<Room> rooms;

    public Game(Player player, ArrayList<Room> rooms) {
        this.player = player;
        this.rooms = rooms;
    }

    public Player getPlayer() {
        return player;
    }

    public int getRooms() {
        return this.rooms.size();
    }
}
