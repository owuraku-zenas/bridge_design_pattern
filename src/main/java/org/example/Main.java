package org.example;

import org.example.device.Device;
import org.example.device.Radio;
import org.example.device.TV;
import org.example.remote.AdvancedRemote;
import org.example.remote.Remote;

public class Main {
    public static void main(String[] args) {
        Device radio = new Radio();
        Remote regularRemote = new Remote(radio);
        System.out.println(radio + "\n");


        regularRemote.togglePower();
        System.out.println(radio + "\n");

        regularRemote.channelUp();
        regularRemote.volumeDown();
        System.out.println(radio + "\n");


        regularRemote.channelUp();
        regularRemote.volumeUp();
        regularRemote.volumeUp();
        System.out.println(radio + "\n");


        regularRemote.togglePower();
        System.out.println(radio + "\n");


        Device tv = new TV();
        AdvancedRemote superRemote = new AdvancedRemote(tv);
        System.out.println(tv + "\n");


        superRemote.togglePower();
        System.out.println(tv + "\n");


        superRemote.changeVolume(80);
        superRemote.volumeUp();
        System.out.println(tv + "\n");


        superRemote.mute();
        superRemote.changeChannel(10);
        System.out.println(tv + "\n");

        superRemote.togglePower();
        System.out.println(tv + "\n");



    }
}