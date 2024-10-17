package As2;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        Device dvd = new DVDDevice();
        Device soundSystem = new SoundSystemDevice();

        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.powerOn();
        basicRemote.setChannel(133);
        basicRemote.setVolume(29);
        basicRemote.powerOff();

        System.out.println();

        RemoteControl advancedRemote = new AdvancedRemote(soundSystem);
        advancedRemote.powerOn();
        advancedRemote.setVolume(30);
        ((AdvancedRemote) advancedRemote).mute();
        advancedRemote.powerOff();
    }
}
