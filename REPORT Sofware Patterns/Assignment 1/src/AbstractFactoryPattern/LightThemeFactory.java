package AbstractFactoryPattern;

public class LightThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public TextField createTextField() {
        return new LightThemeTextField();
    }
}
