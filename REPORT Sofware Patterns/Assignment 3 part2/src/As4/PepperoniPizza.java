package As4;

public class PepperoniPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Пицца Пепперони";
    }

    @Override
    public double getCost() {
        return 9.99;
    }
}
