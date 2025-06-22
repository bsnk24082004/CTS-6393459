package sorting;

import java.util.List;
public class QuickSort {
	public static void quickSort(List<Order> orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    private static int partition(List<Order> orders, int low, int high) {
        Order pivot = orders.get(high);
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (orders.get(j).getTotalPrice() <= pivot.getTotalPrice()) {
                i++;
                // Swap orders[i] and orders[j]
                Order temp = orders.get(i);
                orders.set(i, orders.get(j));
                orders.set(j, temp);
            }
        }

        // Swap orders[i + 1] and pivot
        Order temp = orders.get(i + 1);
        orders.set(i + 1, orders.get(high));
        orders.set(high, temp);

        return i + 1;
    }

}