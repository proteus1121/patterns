package org.proteus1121.prototype.model;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}