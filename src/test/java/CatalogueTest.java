import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;

class CatalogueTest {

    @Test
    void titlesByReturnsEmptyListForUnknownAuthor() {
        BookSource source = new InMemoryBookSource();
        Catalogue catalogue = new Catalogue(source);

        List<String> titles = catalogue.titlesBy("Some Unknown Author");

        assertTrue(titles.isEmpty(), "Querying an unknown author should return an empty list, not null.");
    }
}