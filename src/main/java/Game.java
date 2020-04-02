import Players.Player;

import java.util.ArrayList;

public class Game {

    private Player player;
    private ArrayList<Room> rooms;

    public Game(Player player, ArrayList<Room> rooms) {
        this.player = player;
        this.rooms = rooms;
    }
}
