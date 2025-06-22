package Adapter;

public class PayPalAPI {
    public void sendPayment(double amountInDollars) {
        System.out.println("Processing payment with PayPal: $" + amountInDollars);
    }
}
