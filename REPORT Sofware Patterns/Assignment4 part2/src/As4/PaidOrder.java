package As4;

public class PaidOrder implements State {
    private Order order;

    public PaidOrder(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order shipped.");
        order.setState(order.getShippedState());
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver. Order is not shipped yet.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
        order.setState(order.getCancelledState());
    }
}

