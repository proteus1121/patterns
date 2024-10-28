package org.proteus1121.creation.abscract_factory.creator;

import org.proteus1121.creation.abscract_factory.product.ConcreteProductA1;
import org.proteus1121.creation.abscract_factory.product.ConcreteProductB1;
import org.proteus1121.creation.abscract_factory.product.ProductA;
import org.proteus1121.creation.abscract_factory.product.ProductB;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
