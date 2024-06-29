package design_patterns.structural.bridge.remote_control;

public interface RemoteControl {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void setVolume(int volume);
}

