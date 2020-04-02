import Types.MonsterType;
import Types.TreasureType;

public class Room {
    private TreasureType treasure;
    private MonsterType monster;

    public Room(TreasureType treasure, MonsterType monster) {
        this.treasure = treasure;
        this.monster = monster;
    }

    public MonsterType getMonster() {
        return monster;

    }

    public TreasureType getTreasure() {
        return treasure;
    }
}



