package sorting;

public class Order {
    private int orderId;
    private String customerName;
    private double totalPrice;

    // Constructor
    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    // Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // toString method to display order details
    @Override
    public String toString() {
        return "Order{id=" + orderId + ", customer=" + customerName + ", totalPrice=" + totalPrice + "}";
    }
}