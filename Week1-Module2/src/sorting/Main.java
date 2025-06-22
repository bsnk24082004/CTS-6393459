package sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating some sample customer orders
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(101, "Alice", 250.50));
        orders.add(new Order(102, "Bob", 180.75));
        orders.add(new Order(103, "Charlie", 320.00));
        orders.add(new Order(104, "David", 150.00));
        orders.add(new Order(105, "Eve", 200.25));

        System.out.println("Orders before sorting:");
        printOrders(orders);

        // Sorting with Bubble Sort
        System.out.println("\nSorting with Bubble Sort...");
        BubbleSort.bubbleSort(orders);
        printOrders(orders);

        // Recreate the list for Quick Sort
        orders = new ArrayList<>();
        orders.add(new Order(101, "Alice", 250.50));
        orders.add(new Order(102, "Bob", 180.75));
        orders.add(new Order(103, "Charlie", 320.00));
        orders.add(new Order(104, "David", 150.00));
        orders.add(new Order(105, "Eve", 200.25));

        // Sorting with Quick Sort
        System.out.println("\nSorting with Quick Sort...");
        QuickSort.quickSort(orders, 0, orders.size() - 1);
        printOrders(orders);
    }

    // Utility method to print the orders list
    private static void printOrders(List<Order> orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}