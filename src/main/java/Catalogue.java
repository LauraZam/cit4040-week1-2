import java.util.List;

public class Catalogue {
    private final List<Book> books;

    public Catalogue(BookSource source) {
        this.books = source.load();
    }

    public List<Book> getAllBooks() {
        return books;
    }
}