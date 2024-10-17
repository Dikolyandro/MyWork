package As4;

public class OliveTopping extends ToppingDecorator {
    public OliveTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", с оливками";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.30;
    }
}

