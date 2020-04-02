import Players.Player;import Types.MonsterType;
import Types.TreasureType;

public class Room {
    private TreasureType treasure;
    private MonsterType monster;
    private Player player;

    public Room(TreasureType treasure, MonsterType monster, Player player) {
        this.treasure = treasure;
        this.monster = monster;
        this.player = player;
    }

    public MonsterType getMonster() {
        return monster;

    }

    public TreasureType getTreasure() {
        return treasure;
    }


    public Player getPlayer() {
        return player;
    }
}



