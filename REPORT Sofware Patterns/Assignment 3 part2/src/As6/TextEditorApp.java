package As6;

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        String sampleText = "Hello, my name is Naruto Uzumaki and I am gonna beat everyone of you";
        for (int i = 0; i < 10; i++) {
            textEditor.insertText(sampleText, "Arial", 10);
        }

        textEditor.render();
    }
}
