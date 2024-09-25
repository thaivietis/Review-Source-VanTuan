import java.util.List;

public class StoreManager implements BookService, CustomerService{
    private List<Book> books;
    private List<Customer> customers;

    @Override
    public void addBook(Book book) {
        System.out.println("Book added");
    }

    @Override
    public void removeBook(Book book) {
        System.out.println("Book added");
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void addCustomer(Customer customer) {
        System.out.println("Book added");
    }

    @Override
    public void removeCustomer(Customer customer) {
        System.out.println("Book added");
    }

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }
}
