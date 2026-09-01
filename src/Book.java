public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean available;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        setPages(pages);
        this.available = true;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
    public boolean isAvailable() {
        return available;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages must be greater than zero.");
        }
        this.pages = pages;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public String describe() {
        return "'" + title + "' by " + author + " (" + pages + " pages) - Available: " + available;
    }
}