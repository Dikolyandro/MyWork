package AbstractFactoryPattern;

public class LightThemeTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Проивзодим текстовое поле в светлой теме");
    }
}
