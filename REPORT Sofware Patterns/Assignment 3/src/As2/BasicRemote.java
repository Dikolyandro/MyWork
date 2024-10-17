package As2;

public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }
}


