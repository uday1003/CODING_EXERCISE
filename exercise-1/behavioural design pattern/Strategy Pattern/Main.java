public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        // Pay with PayPal
        cart.setPaymentStrategy(new PaypalPayment());
        cart.checkout(200);
    }
}
