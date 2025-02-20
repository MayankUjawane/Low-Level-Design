package design_patterns.structural_patterns.flyweight_design_pattern.word_processor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, Letter> letterObjectCache = new HashMap<>();

    public static Letter createLetter(char character) {
        if(letterObjectCache.containsKey(character)) {
            System.out.println("Serving from Cache");
            return letterObjectCache.get(character);
        }

        Letter letterObject = new DocumentCharacter(character, "Arial", 10);
        letterObjectCache.put(character, letterObject);
        return letterObject;
    }
}
