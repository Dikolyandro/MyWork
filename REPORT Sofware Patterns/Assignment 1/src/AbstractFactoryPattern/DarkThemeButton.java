package AbstractFactoryPattern;

public class DarkThemeButton implements Button {
    @Override
    public void render() {
        System.out.println("Производим кнопку в темной теме");
    }
}
