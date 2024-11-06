package org.proteus1121.behavioral.template_method;

// Подкласс для приготовления чая
public class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}