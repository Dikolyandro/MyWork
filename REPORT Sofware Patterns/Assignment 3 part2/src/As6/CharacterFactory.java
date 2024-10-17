package As6;

import java.util.HashMap;
import java.util.Map;

class CharacterFactory {
    private Map<String, Character> characters = new HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        String key = value + "_" + font + "_" + size;
        if (!characters.containsKey(key)) {
            characters.put(key, new Character(value, font, size));
        }
        return characters.get(key);
    }
}

