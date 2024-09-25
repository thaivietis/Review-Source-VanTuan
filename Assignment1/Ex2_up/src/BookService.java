import java.util.List;

public interface BookService {
    public void addBook(Book book) ;
    public void removeBook(Book book);
    public List<Book> getBooks();
}
