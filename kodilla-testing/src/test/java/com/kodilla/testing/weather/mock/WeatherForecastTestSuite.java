package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    private static Map<String, Double> mockTemperaturesMap;

    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    static void beforeAll() {
        mockTemperaturesMap = new HashMap<>();
        mockTemperaturesMap.put("Rzeszow", 1.0);
        mockTemperaturesMap.put("Krakow", 2.0);
        mockTemperaturesMap.put("Wroclaw", 3.0);
        mockTemperaturesMap.put("Warszawa", 4.0);
        mockTemperaturesMap.put("Gdansk", 5.0);
    }

    @BeforeEach
    void beforeEach() {
        when(temperaturesMock.getTemperatures()).thenReturn(mockTemperaturesMap);
    }

    @Test
    void testCalculateAverageTemperature() {
        // Given
        var forecast = new WeatherForecast(temperaturesMock);
        // when
        var actual = forecast.calculateAverageTemperature();
        // than
        assertEquals(3, actual);
    }

    @Test
    void testCalculateMedianTemperature() {
        // Given
        var forecast = new WeatherForecast(temperaturesMock);
        // when
        var actual = forecast.calculateMedianTemperature();
        // than
        assertEquals(3, actual);
    }

    @Test
    void testCalculateForecastWithMock() {
        // Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        // When
        int actualQuantityOfSensors = weatherForecast.calculateForecast().size();
        // Then
        assertEquals(5, actualQuantityOfSensors);
    }
}