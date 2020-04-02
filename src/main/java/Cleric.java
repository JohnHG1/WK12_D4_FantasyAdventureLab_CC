import HealingTool.HealingTool;

public class Cleric {

    private HealingTool tool;

    public Cleric(HealingTool tool) {
        this.tool = tool;
    }

    public HealingTool getTool() {
        return tool;
    }

    public void changeTool(HealingTool tool) {
        this.tool = tool;
    }
}
