import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Book> books;
    private EmailService emailService;

    public void addBook(Book book) {
        System.out.println("Book added to cart");
    }

    public void removeBook(Book book) {
        System.out.println("Book removed from cart");
    }

    public void checkOut() {
        //Do something
        emailService.sendViaEmail();
        exportInvoice();
    }

    private void exportInvoice() {
        System.out.println("Export invoice");
    }
}

class EmailService{
    public void sendViaEmail() {
        System.out.println("Order confirmation email sent");
    }
}
