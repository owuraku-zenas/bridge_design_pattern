package org.example.device;

public class TV implements Device{
    private static final int INITIAL_VOLUME = 25;
    private boolean isEnabled;
    private int volume;
    private int channel;

    public TV() {
        isEnabled = false;
        volume = 0;
        channel = 0;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void enable() {
        isEnabled = true;
        volume = INITIAL_VOLUME;
        channel = 1;
    }

    @Override
    public void disable() {
        isEnabled = false;
        volume = 0;
        channel = 0;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int amount) {
        volume = amount;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "TV[" +
                "isEnabled=" + isEnabled +
                ", volume=" + volume +
                ", channel=" + channel +
                ']';
    }
}
