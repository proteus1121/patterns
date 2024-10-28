package org.proteus1121.creation.singleton;

public enum SingletonEnum {
    INSTANCE; // Единственный экземпляр Singleton

    // Пример метода
    public void showMessage() {
        System.out.println("Hello from Singleton using Enum!");
    }
}