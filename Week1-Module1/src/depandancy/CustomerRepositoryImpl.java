package depandancy;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Simulate fetching from DB
        return new Customer(id, "Alice", "alice@example.com");
    }
}