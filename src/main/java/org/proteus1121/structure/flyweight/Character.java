package org.proteus1121.structure.flyweight;

class Character {
    private char symbol; // Инвариантное состояние (код символа)
    private String font; // Инвариантное состояние (шрифт символа)

    public Character(char symbol, String font) {
        this.symbol = symbol;
        this.font = font;
    }

    public void display(int x, int y) {
        System.out.println("Displaying character '" + symbol + "' at (" + x + ", " + y + ") with font: " + font);
    }
}