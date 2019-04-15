package com.automatedhouse;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String _location) {
        location = _location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " Ceiling Fan set to high.");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " Ceiling Fan set to medium.");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " Ceiling Fan set to low.");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " Ceiling Fan is off.");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int _speed) {
        speed = _speed;
    }
}
