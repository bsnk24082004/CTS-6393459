
package strategy;

//PaymentContext.java
public class PaymentContext {
 private PaymentStrategy paymentStrategy;

 public PaymentContext(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 // Set or change the payment strategy at runtime
 public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 // Execute the payment strategy
 public void executePayment(double amount) {
     paymentStrategy.pay(amount);
 }
}
