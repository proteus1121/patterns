package org.proteus1121.creation.builder;

public class BuilderExample {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setFloors(2)
                .setHasPool(true)
                .setHasGarden(true)
                .setHasGarage(true)
                .build();
        System.out.println(house);
    }
}
