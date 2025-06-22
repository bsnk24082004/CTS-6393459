package ecommerce;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) {
        // Create an array of Product objects
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shirt", "Clothing"),
            new Product(4, "Shoes", "Footwear")
        };

        // Linear Search Example
        String target = "Phone";
        Product foundProduct = SearchOperations.linearSearch(products, target);
        System.out.println("Linear Search Found: " + foundProduct);

        // Binary Search Example (First, we need to sort the products by name)
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        foundProduct = SearchOperations.binarySearch(products, target);
        System.out.println("Binary Search Found: " + foundProduct);
    }
}