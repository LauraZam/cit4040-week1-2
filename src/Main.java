import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, backend!");
        Book b1 = new Book("Clean Code", "Robert C. Martin", 464);
        Book b2 = new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", 352);
        Book b3 = new Book("Effective Java", "Joshua Bloch", 412);
        Book b4 = new Book("Java: A Beginner's Guide", "Herbert Schildt", 728);

        List<Book> booksList = new ArrayList<>();
        booksList.add(b1);
        booksList.add(b2);
        booksList.add(b3);
        booksList.add(b4);

        System.out.println("\nTask 4.2: Book List");
        for (Book book : booksList) {
            System.out.println(book.describe());
        }

        int over300Count = 0;
        for (Book book : booksList) {
            if (book.getPages() > 300) {
                over300Count++;
            }
        }
        System.out.println("Number of books with more than 300 pages: " + over300Count);

        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("Clean Code", 5);
        stockMap.put("The Pragmatic Programmer", 3);
        stockMap.put("Effective Java", 8);
        stockMap.put("Java: A Beginner's Guide", 2);

        System.out.println("\nTask 4.3: Stock Map");
        String targetTitle = "Clean Code";
        System.out.println("Copies of \"" + targetTitle + "\" in stock: " + stockMap.get(targetTitle));

        int totalCopies = 0;
        for (Map.Entry<String, Integer> entry : stockMap.entrySet()) {
            System.out.println("Title: \"" + entry.getKey() + "\" | Stock: " + entry.getValue());
            totalCopies += entry.getValue();
        }

        System.out.println("Total number of copies across all titles: " + totalCopies);
    }
}
