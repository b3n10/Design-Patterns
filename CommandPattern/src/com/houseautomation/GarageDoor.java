package com.houseautomation;

public class GarageDoor {
    private String getName() {
        return "Garage Door";
    }

    void up() {
        System.out.println("Open " + getName() + " upwards.");
    }

    void down() {
    }

    void stop() {
        System.out.println("Stop opening " + getName() + ".");
    }

    void lightOn() {
        System.out.println(getName() + " light is on.");
    }

    void lightOff() {
        System.out.println("Light is off in the garage.");
    }

}
