package Adapter;

public class StripeAdapter implements PaymentProcessor {

    private StripeAPI stripe;

    public StripeAdapter(StripeAPI stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makeStripePayment(amount);
    }
}