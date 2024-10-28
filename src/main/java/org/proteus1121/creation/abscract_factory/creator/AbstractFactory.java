package org.proteus1121.creation.abscract_factory.creator;

import org.proteus1121.creation.abscract_factory.product.ProductA;
import org.proteus1121.creation.abscract_factory.product.ProductB;

public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}