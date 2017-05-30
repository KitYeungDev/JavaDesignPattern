package com.kit.design.pattern.observer.innerjava;

import com.kit.design.pattern.observer.customization.CurrentConditionsDisplay;
import com.kit.design.pattern.observer.customization.WeatherData;

/**
 * Created by devkit on 17-5-30.
 */
public class WeatherStation {
    public static void main(String[] args) {
        com.kit.design.pattern.observer.customization.WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
