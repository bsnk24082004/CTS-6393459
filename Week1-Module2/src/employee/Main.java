package employee;

public class Main {
    public static void main(String[] args) {
        // Create an EmployeeManagementSystem with a capacity of 5 employees
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        // Add some employees
        system.addEmployee(new Employee(1, "Alice", "Software Engineer", 80000));
        system.addEmployee(new Employee(2, "Bob", "Data Scientist", 95000));
        system.addEmployee(new Employee(3, "Charlie", "Product Manager", 120000));
        system.addEmployee(new Employee(4, "David", "Designer", 70000));

        // Traverse and display all employees
        System.out.println("All Employees:");
        system.traverseEmployees();

        // Search for an employee by ID
        System.out.println("\nSearching for Employee with ID 2:");
        Employee employee = system.searchEmployee(2);
        if (employee != null) {
            System.out.println("Employee found: " + employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee by ID
        System.out.println("\nDeleting Employee with ID 3:");
        system.deleteEmployee(3);
        system.traverseEmployees();
    }
}