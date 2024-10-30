package org.proteus1121.behavioral.command;

// Класс для управления освещением
class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is ON.");
    }

    public void off() {
        System.out.println(location + " light is OFF.");
    }
}
