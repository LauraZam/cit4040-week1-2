import java.util.ArrayList;
import java.util.List;

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
    }
}
