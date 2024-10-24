package As4;

public class Order {
    private State newState;
    private State paidState;
    private State shippedState;
    private State deliveredState;
    private State cancelledState;

    private State currentState;

    public Order() {
        newState = new NewOrder(this);
        paidState = new PaidOrder(this);
        shippedState = new ShippedOrder(this);
        deliveredState = new DeliveredOrder(this);
        cancelledState = new CancelledOrder(this);

        currentState = newState;
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getNewState() { return newState; }
    public State getPaidState() { return paidState; }
    public State getShippedState() { return shippedState; }
    public State getDeliveredState() { return deliveredState; }
    public State getCancelledState() { return cancelledState; }

    public void payOrder() {
        currentState.payOrder();
    }

    public void shipOrder() {
        currentState.shipOrder();
    }

    public void deliverOrder() {
        currentState.deliverOrder();
    }

    public void cancelOrder() {
        currentState.cancelOrder();
    }
}

