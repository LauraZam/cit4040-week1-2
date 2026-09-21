import java.util.List;

public class InMemoryBookSource implements BookSource {
    @Override
    public List<Book> load() {
        return List.of(
                new Book("Clean Code", "Robert C. Martin", 464, true),
                new Book("Effective Java", "Joshua Bloch", 412, true),
                new Book("Refactoring", "Martin Fowler", 432, false)
        );
    }
}