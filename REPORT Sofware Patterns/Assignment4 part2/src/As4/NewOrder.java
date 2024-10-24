package As4;

public class NewOrder implements State {
    private Order order;

    public NewOrder(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order paid.");
        order.setState(order.getPaidState());
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship. Order is not paid yet.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver. Order is not paid yet.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
        order.setState(order.getCancelledState());
    }
}
