package As3;

public class DimLights implements Command {
    private Light light;
    private int previousLevel;
    private int level;

    public DimLights(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute() {
        previousLevel = light.getBrightness();
        light.dim(level);
    }

    @Override
    public void undo() {
        light.dim(previousLevel);
    }
}

