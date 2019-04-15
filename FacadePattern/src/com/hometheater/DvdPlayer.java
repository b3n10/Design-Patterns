package com.hometheater;

public class DvdPlayer {
    void on() {
        System.out.println("DVD player turning on..");
    }

    void play(String movie) {
        System.out.println("DVD playing movie: " + movie);
    }

    public void stop() {
        System.out.println("DVD player stopping..");
    }

    public void eject() {
        System.out.println("DVD player ejecting media..");
    }

    public void off() {
        System.out.println("DVD player turning off..");
    }
}
