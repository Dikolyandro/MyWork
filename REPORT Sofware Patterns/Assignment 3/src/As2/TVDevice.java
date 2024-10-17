package As2;

public class TVDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("TV channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}



