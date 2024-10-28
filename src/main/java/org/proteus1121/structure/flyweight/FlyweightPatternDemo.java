package org.proteus1121.structure.flyweight;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        // Запрос символов с разными координатами, но теми же значениями и шрифтами
        Character c1 = characterFactory.getCharacter('a', "Arial");
        c1.display(10, 20);

        Character c2 = characterFactory.getCharacter('b', "Arial");
        c2.display(30, 40);

        Character c3 = characterFactory.getCharacter('a', "Arial");
        c3.display(50, 60);

        // Повторный запрос для символа 'a' с шрифтом "Arial" не создаст новый объект
        System.out.println("Is c1 same as c3? " + (c1 == c3));
    }
}