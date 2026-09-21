import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvBookSource implements BookSource {
    private final String filepath;

    public CsvBookSource(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<Book> load() {
        List<Book> books = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filepath));
            for (int i = 1; i < lines.size(); i++) { // Start at 1 to skip CSV header
                String[] data = lines.get(i).split(",");
                books.add(new Book(
                        data[0].trim(),
                        data[1].trim(),
                        Integer.parseInt(data[2].trim()),
                        Boolean.parseBoolean(data[3].trim())
                ));
            }
        } catch (Exception e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        return books;
    }
}