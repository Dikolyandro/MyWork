package As4;

public class HawaiianPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Гавайская пицца с ананасами";
    }

    @Override
    public double getCost() {
        return 10.99;
    }
}
