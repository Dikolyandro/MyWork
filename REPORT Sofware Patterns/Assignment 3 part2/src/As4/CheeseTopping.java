package As4;

public class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", с дополнительным сыром";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}


