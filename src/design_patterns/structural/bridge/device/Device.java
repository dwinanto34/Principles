package design_patterns.structural.bridge.device;

public interface Device {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
    void setVolume(int volume);
}
