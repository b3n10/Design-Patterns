package com.automatedhouse;

public class BrightLight {
    private String _name;

    public BrightLight(String name) {
       _name = name;
    }

    public void on() {
        System.out.println(_name + " light is turned on.");
    }

    public void off() {
        System.out.println(_name + " light is turned off.");
    }
}
