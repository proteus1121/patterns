package org.proteus1121.builder;

// Класс, который нужно построить
public class House {
    private int floors;      // Количество этажей
    private boolean hasPool; // Есть ли бассейн
    private boolean hasGarden; // Есть ли сад
    private boolean hasGarage; // Есть ли гараж

    // Приватный конструктор для использования Builder
    private House(Builder builder) {
        this.floors = builder.floors;
        this.hasPool = builder.hasPool;
        this.hasGarden = builder.hasGarden;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House [floors=" + floors +
                ", hasPool=" + hasPool +
                ", hasGarden=" + hasGarden +
                ", hasGarage=" + hasGarage + "]";
    }

    // Статический вложенный класс Builder
    public static class Builder {
        private int floors;
        private boolean hasPool;
        private boolean hasGarden;
        private boolean hasGarage;

        // Методы для установки значений параметров
        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public Builder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        // Метод для создания объекта House
        public House build() {
            return new House(this);
        }
    }
}
