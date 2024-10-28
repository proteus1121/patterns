package org.proteus1121.creation.prototype.model;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Метод clone для клонирования объекта
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone(); // Вызываем метод clone из Object
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
