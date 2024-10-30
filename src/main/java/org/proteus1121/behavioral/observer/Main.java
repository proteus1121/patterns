package org.proteus1121.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay display = new TemperatureDisplay();
        AlertSystem alertSystem = new AlertSystem();

        // Добавляем наблюдателей
        weatherStation.addObserver(display);
        weatherStation.addObserver(alertSystem);

        // Изменяем температуру
        System.out.println("Setting temperature to 25°C:");
        weatherStation.setTemperature(25);

        System.out.println("\nSetting temperature to 35°C:");
        weatherStation.setTemperature(35);
    }
}