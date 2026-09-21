import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CatalogueTest {

    @Test
    void catalogueLoadsBooksCorrectly() {
        BookSource source = new InMemoryBookSource();
        Catalogue catalogue = new Catalogue(source);

        assertEquals(3, catalogue.getAllBooks().size(), "Catalogue should load 3 books from the in-memory source");
    }
}