package org.example.remote;

import org.example.device.Device;

public class Remote {
    protected Device device;


    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) device.disable();
        else device.enable();
    }

    public void volumeUp() {
        if (!device.isEnabled()) return;
        int oldVolume = device.getVolume();
        device.setVolume(oldVolume+1);
    }

    public void volumeDown() {
        if (!device.isEnabled()) return;
        int oldVolume = device.getVolume();
        if (oldVolume == 0) return;
        device.setVolume(oldVolume-1);
    }

    public void channelUp() {
        if (!device.isEnabled()) return;
        int oldChannel = device.getChannel();
        device.setChannel(oldChannel+1);
    }

    public void channelDown() {
        if (!device.isEnabled()) return;
        int oldChannel = device.getChannel();
        if (oldChannel == 0) return;
        device.setChannel(oldChannel+1);
    }
}
