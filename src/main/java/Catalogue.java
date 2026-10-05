import java.util.List;

public class Catalogue {
    private final List<Book> books;

    public Catalogue(BookSource source) {
        this.books = source.load();
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<String> titlesBy(String authorName) {
        return books.stream()
                .filter(b -> b.author().equals(authorName))
                .map(Book::title)
                .sorted()
                .toList();
    }
}