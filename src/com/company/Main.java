package com.company;


import com.company.Weather.CurrentConditionDisplay;
import com.company.Weather.HeatIndexDisplay;
import com.company.Weather.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay  currentConditionDisplay= new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMesurement(80,65,30.4f);
        weatherData.setMesurement(82, 70, 29.2f);
        weatherData.setMesurement(84, 75, 28.4f);
    }
}
