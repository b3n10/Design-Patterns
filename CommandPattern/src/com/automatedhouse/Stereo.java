package com.automatedhouse;

public class Stereo {
    private String _name;
    private int volume;

    public Stereo(String name) {
       _name = name;
    }

    public void on() {
        System.out.println(_name + " Stereo is turned on.");
    }

    public void off() {
        System.out.println(_name + " Stereo is turned off.");
    }

    public void setCD() {
        System.out.println("CD is now set on " + _name + " Stereo.");
    }

    public void setDVD() {
        System.out.println("DVD is now set.");
    }

    public void setVolume(int _volume) {
       volume = _volume;
        System.out.println(_name + " Stereo volume is set to " + volume);
    }
}
