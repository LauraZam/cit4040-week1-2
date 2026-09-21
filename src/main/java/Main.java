public class Main {
    public static void main(String[] args) {
        System.out.println("Loading catalogue from CSV...");

        BookSource source = new CsvBookSource("books.csv");
        Catalogue catalogue = new Catalogue(source);

        System.out.println("\nBooks in Catalogue:");
        for (Book book : catalogue.getAllBooks()) {
            System.out.println(book.describe());
        }
    }
}