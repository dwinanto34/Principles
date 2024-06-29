package design_patterns.structural.bridge.remote_control;

import design_patterns.structural.bridge.device.Device;

public class BasicRemoteControl implements RemoteControl {
    protected Device device;

    public BasicRemoteControl(Device device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        device.turnOn();
    }

    @Override
    public void powerOff() {
        device.turnOff();
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}

