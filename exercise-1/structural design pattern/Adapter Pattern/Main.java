public class Main {
    public static void main(String[] args) {
        // Using the old payment gateway through the adapter
        OldPaymentGateway oldGateway = new OldPaymentGateway();
        NewPaymentGateway paymentGateway = new PaymentAdapter(oldGateway);
        
        // Making payment using the adapter
        paymentGateway.makePayment();
    }
}
