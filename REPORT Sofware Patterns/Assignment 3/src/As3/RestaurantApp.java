package As3;

public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent bigMac = new MenuItem("Big Mac", "Сэндвич с двумя котлетами и специальным соусом", 4.99);
        MenuComponent cheeseburger = new MenuItem("Cheeseburger", "Сэндвич с котлетой и сыром", 2.99);
        MenuComponent fries = new MenuItem("French Fries", "Криспящие картофельные фри", 1.99);
        MenuComponent mcFlurry = new MenuItem("McFlurry", "Мороженое с кусочками печенья", 2.49);
        MenuComponent eggMcMuffin = new MenuItem("Egg McMuffin", "Завтрак с яйцом и ветчиной", 3.49);
        MenuComponent pancakes = new MenuItem("Hotcakes", "Панкейки с сиропом", 3.99);

        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Завтраки в McDonald's");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Обеды в McDonald's");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Десерты в McDonald's");

        breakfastMenu.add(eggMcMuffin);
        breakfastMenu.add(pancakes);

        lunchMenu.add(bigMac);
        lunchMenu.add(cheeseburger);
        lunchMenu.add(fries);

        dessertMenu.add(mcFlurry);

        MenuComponent allMenus = new Menu("All Menus", "Все доступные меню McDonald's");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dessertMenu);

        allMenus.print();
    }
}

