package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public double calculateAverageTemperature() {
        double sum = 0;
        var temps = temperatures.getTemperatures();
        for(var value : temps.values()) {
            sum += value;
        }
        return sum / temps.size();
    }

    public double calculateMedianTemperature() {
        var values = new ArrayList<Double>(temperatures.getTemperatures().values());
        Collections.sort(values);
        var size = values.size();
        if (size % 2 != 0) {
            return values.get(size / 2);
        }
        else {
            return (values.get(size / 2) + values.get(size / 2 - 1)) / 2;
        }
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
}