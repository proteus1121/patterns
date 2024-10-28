package org.proteus1121.creation.factory_method.creator;

import org.proteus1121.creation.factory_method.product.Product;

public abstract class Creator {
    // Фабричный метод
    public abstract Product createProduct();

    // Бизнес-логика, использующая фабричный метод
    public void someOperation() {
        Product product = createProduct();
        product.doSomething();
    }
}
