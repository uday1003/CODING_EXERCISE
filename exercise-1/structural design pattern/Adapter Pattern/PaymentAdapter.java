public class PaymentAdapter implements NewPaymentGateway {
    private OldPaymentGateway oldGateway;

    public PaymentAdapter(OldPaymentGateway oldGateway) {
        this.oldGateway = oldGateway;
    }

    @Override
    public void makePayment() {
        oldGateway.processTransaction();
    }
}
