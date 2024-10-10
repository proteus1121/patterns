package org.proteus1121.prototype.model;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

