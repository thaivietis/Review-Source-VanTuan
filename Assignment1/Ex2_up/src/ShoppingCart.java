import java.util.List;
public class ShoppingCart implements BookService {
    private List<Book> books;
    private EmailService emailService;

    public void checkOut() {
        //Do something
        emailService.sendViaEmail();
        exportInvoice();
    }

    private void exportInvoice() {
        System.out.println("Export invoice");
    }

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
}

class EmailService{
    public void sendViaEmail() {
        System.out.println("Order confirmation email sent");
    }
}
