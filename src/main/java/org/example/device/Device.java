package org.example.device;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int amount);
    int getChannel();
    void setChannel(int channel);
}
