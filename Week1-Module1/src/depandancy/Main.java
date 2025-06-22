
package depandancy;

public class Main {
    public static void main(String[] args) {
        // Create repository implementation
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject into service using constructor
        CustomerService service = new CustomerService(repository);

        // Use the service
        service.displayCustomerById("C101");
    }
}
