package As1;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("4404-4301-2355-5566", "Damir Damirov", "111"));
        cart.checkout(150.0);

        cart.setPaymentStrategy(new PayPalPayment("damkasyzdyk@gmail.com"));
        cart.checkout(1000.0);

        cart.setPaymentStrategy(new CryptoPayment("1A2b3C4d5E6f7G8h9I"));
        cart.checkout(12500.0);
    }
}
