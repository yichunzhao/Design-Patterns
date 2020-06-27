package builder;

public class Book {
    private String title;
    private String Author;
    private int pages;

    public Book() {
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        Author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
