package com.weatherstation01;

import com.observerpattern.DisplayElement;
import com.observerpattern.Observer;
import com.observerpattern.Subject;

public class PressureDisplay implements Observer, DisplayElement {
    private final Subject weatherData;
    private float pressure;

    public PressureDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("This is status of pressure: " + this.pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
}
