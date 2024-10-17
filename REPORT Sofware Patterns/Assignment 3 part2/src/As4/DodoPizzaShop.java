package As4;

public class DodoPizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        pizza = new CheeseTopping(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        pizza = new MushroomTopping(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        pizza = new OliveTopping(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        Pizza pepperoniPizza = new PepperoniPizza();
        pepperoniPizza = new CheeseTopping(pepperoniPizza);
        System.out.println(pepperoniPizza.getDescription() + " - $" + pepperoniPizza.getCost());
    }
}
