package org.proteus1121.behavioral.observer;

// Класс AlertSystem, представляющий наблюдателя, который отправляет оповещения
class AlertSystem implements Observer {
    @Override
    public void update(float temperature) {
        if (temperature > 30) {
            System.out.println("Alert: High temperature detected!");
        }
    }
}