package As3;

public class Light {
    private int brightness;

    public void on() {
        System.out.println("Lights are ON");
    }

    public void off() {
        System.out.println("Lights are OFF");
    }

    public void dim(int level) {
        brightness = level;
        System.out.println("Lights dimmed to " + level + "%");
    }

    public int getBrightness() {
        return brightness;
    }
}

