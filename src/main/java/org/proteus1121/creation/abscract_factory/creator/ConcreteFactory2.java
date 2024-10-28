package org.proteus1121.creation.abscract_factory.creator;

import org.proteus1121.creation.abscract_factory.product.ConcreteProductA2;
import org.proteus1121.creation.abscract_factory.product.ConcreteProductB2;
import org.proteus1121.creation.abscract_factory.product.ProductA;
import org.proteus1121.creation.abscract_factory.product.ProductB;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}