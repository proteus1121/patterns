package org.proteus1121.behavioral.observer;

// Класс TemperatureDisplay, представляющий наблюдателя, который выводит температуру
class TemperatureDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Display: Current temperature is " + temperature + "°C");
    }
}