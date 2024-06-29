package design_patterns.structural.bridge.device;

public class DVDPlayerDevice implements Device {
    @Override
    public void turnOn() {
        System.out.println("DVD Player is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("DVD Player is OFF");
    }

    @Override
    public void setChannel(int channel) {
        // DVD player does not have channels
        System.out.println("DVD Player does not have channels");
    }

    @Override
    public void setVolume(int volume) {
        // DVD player volume control
        System.out.println("DVD Player volume set to " + volume);
    }
}
