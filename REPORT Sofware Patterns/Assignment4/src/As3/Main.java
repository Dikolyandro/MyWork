package As3;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light livingRoomLight = new Light();

        Command tvOn = new TurnTVOn(tv);
        Command tvOff = new TurnTVOn(tv) {
            @Override
            public void execute() { tv.off(); }
        };

        Command stereoVolumeUp = new SetVolume(stereo, 15);
        Command stereoVolumeDown = new SetVolume(stereo, 5);

        Command dimLights = new DimLights(livingRoomLight, 50);
        Command lightsOff = new DimLights(livingRoomLight, 0);

        remote.setCommand(0, tvOn, tvOff);
        remote.setCommand(1, stereoVolumeUp, stereoVolumeDown);
        remote.setCommand(2, dimLights, lightsOff);

        remote.pressOnButton(0);
        remote.pressOffButton(0);

        remote.pressOnButton(1);
        remote.pressUndoButton();

        remote.pressOnButton(2);
        remote.pressUndoButton();
    }
}

