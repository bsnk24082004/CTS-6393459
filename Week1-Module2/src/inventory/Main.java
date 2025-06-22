
package inventory;

public class Main {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        // Create some products
        Product product1 = new Product(101, "Laptop", 50, 799.99);
        Product product2 = new Product(102, "Smartphone", 200, 499.99);
        Product product3 = new Product(103, "Tablet", 30, 299.99);

        // Add products to inventory
        inventorySystem.addProduct(product1);
        inventorySystem.addProduct(product2);
        inventorySystem.addProduct(product3);

        // View inventory
        System.out.println("\nCurrent Inventory:");
        inventorySystem.viewInventory();

        // Update a product's details
        inventorySystem.updateProduct(102, 250, 459.99);  // Update quantity and price for Smartphone

        // View inventory again after update
        System.out.println("\nInventory after update:");
        inventorySystem.viewInventory();

        // Delete a product
        inventorySystem.deleteProduct(103);  // Delete the Tablet product

        // View inventory again after deletion
        System.out.println("\nInventory after deletion:");
        inventorySystem.viewInventory();
    }
}
