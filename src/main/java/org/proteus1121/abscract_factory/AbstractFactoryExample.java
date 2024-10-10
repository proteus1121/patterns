package org.proteus1121.abscract_factory;

import org.proteus1121.abscract_factory.creator.AbstractFactory;
import org.proteus1121.abscract_factory.creator.ConcreteFactory1;
import org.proteus1121.abscract_factory.creator.ConcreteFactory2;
import org.proteus1121.abscract_factory.product.ProductA;
import org.proteus1121.abscract_factory.product.ProductB;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.doSomethingA();
        productB1.doSomethingB();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.doSomethingA();
        productB2.doSomethingB();
    }
}