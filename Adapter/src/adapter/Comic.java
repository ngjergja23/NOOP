package adapter;

public class Comic {

    private String title;
    private String author;
    private int numOfPAges;

    public Comic(String title, String author, int numOfPAges) {
        this.title = title;
        this.author = author;
        this.numOfPAges = numOfPAges;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfPAges() {
        return numOfPAges;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numOfPAges=" + numOfPAges +
                '}';
    }
}
