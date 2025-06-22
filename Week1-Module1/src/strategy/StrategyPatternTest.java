
package strategy;

//StrategyPatternTest.java
public class StrategyPatternTest {
 public static void main(String[] args) {
     // Create payment methods (strategies)
     PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
     PaymentStrategy paypalPayment = new PayPalPayment("john.doe@example.com");

     // Create context and set strategy at runtime
     PaymentContext paymentContext = new PaymentContext(creditCardPayment);

     // Make a payment using Credit Card
     System.out.println("Payment Method: Credit Card");
     paymentContext.executePayment(250.75);

     // Change strategy to PayPal and make a payment
     paymentContext.setPaymentStrategy(paypalPayment);
     System.out.println("\nPayment Method: PayPal");
     paymentContext.executePayment(120.50);
 }
}
