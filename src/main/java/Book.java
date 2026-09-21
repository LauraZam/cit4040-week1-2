public record Book(String title, String author, int pages, boolean available) {

    public Book {
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages must be greater than zero.");
        }
    }

    public Book(String title, String author, int pages) {
        this(title, author, pages, true);
    }

    public String describe() {
        return "\"" + title + "\" by " + author + " (" + pages + " pages) - Available: " + available;
    }
}