package Adapter;

public class Main {
    public static void main(String[] args) {
        // Stripe Payment
        StripeAPI stripeAPI = new StripeAPI();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeAPI);
        stripeProcessor.processPayment(100.00);

        // PayPal Payment
        PayPalAPI paypalAPI = new PayPalAPI();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypalAPI);
        paypalProcessor.processPayment(250.50);
    }
}
