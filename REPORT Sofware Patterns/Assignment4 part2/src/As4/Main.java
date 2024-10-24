package As4;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.payOrder();
        order.shipOrder();
        order.deliverOrder();

        order.cancelOrder();

        System.out.println("\nResetting order to New state...\n");
        order = new Order();
        order.cancelOrder();
        order.payOrder();
        order.cancelOrder();
    }
}

