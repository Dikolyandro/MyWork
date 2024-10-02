package AbstractFactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тему интерфейса: 1 - Dark, 2 - Light");
        int choice = scanner.nextInt();

        UIFactory uiFactory;

        if (choice == 1) {
            uiFactory = new DarkThemeFactory();
        } else if (choice == 2) {
            uiFactory = new LightThemeFactory();
        } else {
            System.out.println("Инвалидный выбор");
            return;
        }

        Button button = uiFactory.createButton();
        TextField textField = uiFactory.createTextField();

        button.render();
        textField.render();
    }
}
