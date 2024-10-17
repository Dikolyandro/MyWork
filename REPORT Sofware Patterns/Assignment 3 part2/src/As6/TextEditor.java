package As6;

import java.util.ArrayList;
import java.util.List;

class TextEditor {
    private CharacterFactory characterFactory;
    private List<Character> characters;

    public TextEditor() {
        characterFactory = new CharacterFactory();
        characters = new ArrayList<>();
    }

    public void insertText(String text, String font, int size) {
        for (char c : text.toCharArray()) {
            characters.add(characterFactory.getCharacter(c, font, size));
        }
    }

    public void render() {
        for (int i = 0; i < characters.size(); i++) {
            characters.get(i).render(i);
        }
    }
}
