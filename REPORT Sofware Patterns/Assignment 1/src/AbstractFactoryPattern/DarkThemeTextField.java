package AbstractFactoryPattern;

public class DarkThemeTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Производим Текстовое поле в темной теме");
    }
}
