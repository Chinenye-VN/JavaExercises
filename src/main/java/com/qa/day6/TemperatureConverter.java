package com.qa.day6;

public class TemperatureConverter {
    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    public double convertCelsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * (celsius) + 32;
    }

    public float convertKelvinToCelsius(int kelvin) {
        return (kelvin - 273);
    }

    public float convertCelsiusToKelvin(int celsius) {
        return (celsius + 273);
    }

    public double convertKelvinToFahrenheit(double kelvin) {
        return (9.0 / 5.0) * (kelvin - 273) + 32;
    }

    public double convertFahrenheitToKelvin(double fahrenheit) {
        return (5.0/ 9.0) * (fahrenheit - 32) + 273;
    }
}
