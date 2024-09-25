import java.util.List;

public interface CustomerService {
    public void addCustomer(Customer customer);

    public void removeCustomer(Customer customer);

    public List<Customer> getCustomers();
}
