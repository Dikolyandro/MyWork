package As4;

public class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", с грибами";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.20;
    }
}