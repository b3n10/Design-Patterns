package com.weatherstation02;

import com.observerpattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer, DisplayElement {
    private final Observable observable;
    private float temp;
    private float humidity;

    public GeneralDisplay(Observable o) {
        this.observable = o;
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temp + "F deg and " + humidity + "% humidity.");
    }
}
