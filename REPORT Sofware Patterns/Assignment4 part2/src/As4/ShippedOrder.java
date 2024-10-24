package As4;

public class ShippedOrder implements State {
    private Order order;

    public ShippedOrder(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order already shipped.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order delivered.");
        order.setState(order.getDeliveredState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cannot cancel. Order is already shipped.");
    }
}

