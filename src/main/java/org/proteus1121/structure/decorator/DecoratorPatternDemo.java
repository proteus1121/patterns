package org.proteus1121.structure.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Text simpleText = new SimpleText("Hello, world!");

        // Обернем простой текст в жирный декоратор
        Text boldText = new BoldTextDecorator(simpleText);
        System.out.println("Bold Text: " + boldText.getText());

        // Обернем текст в курсивный декоратор
        Text italicText = new ItalicTextDecorator(simpleText);
        System.out.println("Italic Text: " + italicText.getText());

        // Комбинированное форматирование (жирный и курсив)
        Text boldItalicText = new ItalicTextDecorator(boldText);
        System.out.println("Bold and Italic Text: " + boldItalicText.getText());
    }
}