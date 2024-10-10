package org.proteus1121.factory_method.product;

public class ConcreteProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("Product A is doing something");
    }
}