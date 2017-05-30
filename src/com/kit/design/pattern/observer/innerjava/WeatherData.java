package com.kit.design.pattern.observer.innerjava;

import com.kit.design.pattern.observer.customization.Observer;
import com.kit.design.pattern.observer.customization.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by devkit on 17-5-30.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
