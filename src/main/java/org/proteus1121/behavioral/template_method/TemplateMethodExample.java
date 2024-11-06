package org.proteus1121.behavioral.template_method;

public class TemplateMethodExample {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println();

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}