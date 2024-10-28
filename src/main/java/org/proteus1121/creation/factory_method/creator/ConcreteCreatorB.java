package org.proteus1121.creation.factory_method.creator;

import org.proteus1121.creation.factory_method.product.ConcreteProductB;
import org.proteus1121.creation.factory_method.product.Product;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
