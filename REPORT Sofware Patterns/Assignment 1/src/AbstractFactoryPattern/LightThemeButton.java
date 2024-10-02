package AbstractFactoryPattern;

public class LightThemeButton implements Button {
    @Override
    public void render() {
        System.out.println("Производим кнопку в светлой теме");
    }
}
