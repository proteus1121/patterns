package org.proteus1121.creation.factory_method.creator;

import org.proteus1121.creation.factory_method.product.ConcreteProductA;
import org.proteus1121.creation.factory_method.product.Product;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}