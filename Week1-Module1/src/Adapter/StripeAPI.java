package Adapter;

public class StripeAPI {
    public void makeStripePayment(double amount) {
        System.out.println("Processing payment with Stripe: $" + amount);
    }
}
