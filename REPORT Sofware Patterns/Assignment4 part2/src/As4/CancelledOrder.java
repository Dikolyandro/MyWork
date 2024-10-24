package As4;

public class CancelledOrder implements State {
    private Order order;

    public CancelledOrder(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Cannot pay. Order is cancelled.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship. Order is cancelled.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver. Order is cancelled.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order already cancelled.");
    }
}

