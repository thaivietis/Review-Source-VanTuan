import java.util.List;

public class StoreManager {
        private List<Book> books;
        private List<Customer> customers;

        public void addBook(Book book) {
            System.out.println("Book added");
        }

        public void removeBook(Book book) {
            System.out.println("Book removed");
        }

        public List<Book> getBooks() {
            return books;
        }

        public void addCustomer(Customer customer) {
            System.out.println("Customer added");
        }

        public void removeCustomer(Customer customer) {
            System.out.println("Customer removed");
        }

        public List<Customer> getCustomers() {
            return customers;
        }
}
