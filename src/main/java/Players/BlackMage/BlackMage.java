package Players.BlackMage;

import Players.Player;

public abstract class BlackMage extends Player {

    private SpellType spellType;
    private CreatureType creature;
    private int health;


    public BlackMage(SpellType spellType, CreatureType creature, int health){
        this.spellType = spellType;
        this.health = health;
        this.creature = creature;
    }

    public SpellType getSpellType(){
        return spellType;
    }

    public void setSpellType(SpellType spellType){
        this.spellType = spellType;
    }

    public int getHealth(){
        return health;
    }

    public CreatureType getCreature() {
        return creature;
    }

    public void setCreature(CreatureType creature) {
        this.creature = creature;
    }
}

