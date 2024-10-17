package As2;
public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void powerOn() {
        device.powerOn();
    }

    public void powerOff() {
        device.powerOff();
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    public abstract void setChannel(int channel);
}
