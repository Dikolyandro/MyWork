package As2;

public class SoundSystemDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("Sound System is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound System is OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound System can't change channel");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Sound System volume set to " + volume);
    }
}