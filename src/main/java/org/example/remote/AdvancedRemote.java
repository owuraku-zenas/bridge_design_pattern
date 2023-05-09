package org.example.remote;

import org.example.device.Device;

public class AdvancedRemote extends Remote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

    public void changeChannel(int channel) {
        device.setChannel(channel);
    }

    public void changeVolume(int volume) {
        device.setVolume(volume);
    }
}
