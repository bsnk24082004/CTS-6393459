package ecommerce;
import java.util.Arrays;
import java.util.Comparator;

public class SearchOperations  {

	
	public static Product linearSearch(Product[] products, String targetProductName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(targetProductName)) {
                return product;
            }
        }
        return null; // Return null if product is not found
    }
    // Binary Search
    public static Product binarySearch(Product[] products, String targetProductName) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Product midProduct = products[mid];

            if (midProduct.getProductName().equalsIgnoreCase(targetProductName)) {
                return midProduct;
            } else if (midProduct.getProductName().compareToIgnoreCase(targetProductName) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; // Return null if product is not found
    }
}