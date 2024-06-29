package design_patterns.structural.bridge.device;

public class TVDevice implements Device {
    private int channel = 1;
    private int volume = 10;

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV Channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV Volume set to " + volume);
    }
}
