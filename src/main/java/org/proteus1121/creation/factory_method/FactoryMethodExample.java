package org.proteus1121.creation.factory_method;

import org.proteus1121.creation.factory_method.creator.ConcreteCreatorA;
import org.proteus1121.creation.factory_method.creator.ConcreteCreatorB;
import org.proteus1121.creation.factory_method.creator.Creator;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();
    }
}
