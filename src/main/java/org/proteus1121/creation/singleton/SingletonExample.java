package org.proteus1121.creation.singleton;

public class SingletonExample {
    public static void main(String[] args) {
        // opt 1. Получаем единственный экземпляр Singleton
        Singleton singleton = Singleton.getInstance();

        // Используем метод Singleton
        singleton.showMessage();

        System.out.println("---------");
        
        // opt 2. Получаем единственный экземпляр SingletonEnum
        SingletonEnum instance = SingletonEnum.INSTANCE;
        instance.showMessage();
    }
}
