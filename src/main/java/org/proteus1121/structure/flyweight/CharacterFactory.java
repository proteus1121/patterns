package org.proteus1121.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

// Фабрика легковесов
class CharacterFactory {
    private Map<String, Character> characterMap = new HashMap<>();

    public Character getCharacter(char symbol, String font) {
        String key = symbol + "_" + font;
        Character character = characterMap.get(key);

        if (character == null) {
            character = new Character(symbol, font);
            characterMap.put(key, character);
            System.out.println("Creating new character: " + symbol + " with font: " + font);
        }
        return character;
    }
}