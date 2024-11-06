package org.proteus1121.behavioral.template_method;

abstract class Beverage {
    // Шаблонный метод, определяющий последовательность шагов
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Шаги, общие для всех напитков
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Абстрактные методы, которые должны быть реализованы в подклассах
    abstract void brew();
    abstract void addCondiments();
}