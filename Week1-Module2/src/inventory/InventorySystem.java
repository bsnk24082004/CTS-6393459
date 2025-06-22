package inventory;

import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    private Map<Integer, Product> inventory;

    public InventorySystem() {
        this.inventory = new HashMap<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Added product: " + product.getProductName());
        }
    }

    // Update an existing product
    public void updateProduct(int productId, Integer quantity, Double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            if (quantity != null) {
                product.setQuantity(quantity);
            }
            if (price != null) {
                product.setPrice(price);
            }
            System.out.println("Updated product: " + product.getProductName());
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    // Delete a product from the inventory
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            Product deletedProduct = inventory.remove(productId);
            System.out.println("Deleted product: " + deletedProduct.getProductName());
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    // View the current inventory
    public void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }
}