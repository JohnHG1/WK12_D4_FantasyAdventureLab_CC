package Players;

import Types.HealingTool;

public class Cleric extends Player {

    private HealingTool tool;
    private int health;

    public Cleric(HealingTool tool, int health) {
        this.tool = tool;
        this.health = health;
    }

    public HealingTool getTool() {
        return tool;
    }

    public void changeTool(HealingTool tool) {
        this.tool = tool;
    }

    public int getHealth() {
        return health;
    }
}
