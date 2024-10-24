package As4;

public class DeliveredOrder implements State {
    private Order order;

    public DeliveredOrder(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order already delivered.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order already delivered.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cannot cancel. Order is already delivered.");
    }
}
