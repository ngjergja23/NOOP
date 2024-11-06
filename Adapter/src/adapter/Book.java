package adapter;

public class Book {


    private String title;
    private String author;
    private int numOfPages;

    public Book(String title, String author, int numOfPAges) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPAges;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numOfPAges=" + numOfPages +
                '}';
    }
}
