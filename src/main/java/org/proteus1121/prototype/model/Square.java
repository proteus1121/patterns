package org.proteus1121.prototype.model;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}
