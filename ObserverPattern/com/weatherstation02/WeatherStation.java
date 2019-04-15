package com.weatherstation02;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        weatherData.setMeasurements(34, 43, 42);
    }
}
