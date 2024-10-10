package org.proteus1121.prototype;

import org.proteus1121.prototype.model.Circle;
import org.proteus1121.prototype.model.Rectangle;
import org.proteus1121.prototype.model.Shape;
import org.proteus1121.prototype.model.Square;

import java.util.HashMap;
import java.util.Map;

class ShapeCache {
    private static final Map<String, Shape> SHAPE_MAP = new HashMap<>();

    // Метод для получения клона объекта по id
    public static Shape getShape(String shapeId) {
        Shape cachedShape = SHAPE_MAP.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // Инициализация кэша с прототипами
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        SHAPE_MAP.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        SHAPE_MAP.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        SHAPE_MAP.put(rectangle.getId(), rectangle);

        System.out.println("Cached objects: circle: " + circle.hashCode() + ", square: " + square.hashCode() + ", rectangle: " + rectangle.hashCode());
    }
}