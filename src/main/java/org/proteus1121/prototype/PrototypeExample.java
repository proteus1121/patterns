package org.proteus1121.prototype;

import org.proteus1121.prototype.model.Shape;

public class PrototypeExample {
    public static void main(String[] args) {
        // Загрузка прототипов в кэш
        ShapeCache.loadCache();

        // Получаем и клонируем объекты из кэша
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.hashCode());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.hashCode());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.hashCode());
    }
}
