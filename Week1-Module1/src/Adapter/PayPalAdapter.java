package Adapter;

public class PayPalAdapter implements PaymentProcessor {

    private PayPalAPI paypal;

    public PayPalAdapter(PayPalAPI paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.sendPayment(amount);
    }
}
