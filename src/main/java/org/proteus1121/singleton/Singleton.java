package org.proteus1121.singleton;

public class Singleton {

    // Приватное статическое поле для единственного экземпляра
    private static Singleton instance;

    // Приватный конструктор предотвращает создание экземпляров извне
    private Singleton() {
        // Инициализация ресурса
        System.out.println("Singleton instance created");
    }

    // Публичный статический метод для получения единственного экземпляра
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Ленивая инициализация
        }
        return instance;
    }

    // Пример метода для использования объекта Singleton
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}