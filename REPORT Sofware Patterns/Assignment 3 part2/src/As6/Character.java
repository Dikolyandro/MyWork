package As6;

class Character {
    private char value;
    private String font;
    private int size;

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public char getValue() {
        return value;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public void render(int position) {
        System.out.println("Rendering '" + value + "' at position " + position + " in " + font + " of size " + size);
    }
}
