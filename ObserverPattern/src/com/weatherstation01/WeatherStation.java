package com.weatherstation01;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
