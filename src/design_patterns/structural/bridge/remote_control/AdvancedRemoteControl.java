package design_patterns.structural.bridge.remote_control;

import design_patterns.structural.bridge.device.Device;

public class AdvancedRemoteControl implements RemoteControl {
    protected Device device;

    public AdvancedRemoteControl(Device device) {
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

    public void mute() {
        device.setVolume(0);
        System.out.println("Muted the volume");
    }
}
