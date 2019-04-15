package com.hometheater;

public class Amplifier {
    void on() {
        System.out.println("Amplifier turning on..");
    }

    void setVolume(int volume) {
        System.out.println("Amplifier setting volume to " + volume);
    }

    public void off() {
        System.out.println("Amplifier turning off..");
    }
}
