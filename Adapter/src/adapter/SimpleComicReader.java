package adapter;

public class SimpleComicReader implements ComicReader{

    private Comic comic;
    private int currentPage;
    private int totalPages;
    private static final int MAX = 200;
    private static final int MIN = 20;
    private int zoom;
    private boolean nightReading;



    public SimpleComicReader() {
        System.out.println("Ready to read comics...\n Please provide some comics: ");
        this.nightReading = false;
    }

    public void setComic(Comic comic) {
        this.comic = comic;
        this.currentPage = 1;
        this.zoom = 100;

        System.out.println(comic);
        System.out.println(this);
    }

    @Override
    public void goToPage(int numPage) throws PageOutOfRange {
        if (comic != null){
            if (numPage <= totalPages){
                currentPage = numPage;
                System.out.println("Reader on the page: " + currentPage);
            } else {
                throw new PageOutOfRange();
            }
        }
    }

    @Override
    public void next() {

        if (comic != null) {

            if (currentPage <= totalPages) {
                currentPage++;
                System.out.println("Reader on the page: " + currentPage);
            }
        }

    }

    @Override
    public int currentPage() {
        return currentPage;
    }

    @Override
    public void previous() {

        if (comic != null) {
            if (currentPage <= totalPages) {
                currentPage--;
                System.out.println("Reader on the page: " + currentPage);
            }
        }
    }

    @Override
    public void first() {
        if (comic != null) {
            currentPage = 1;
        }
    }

    @Override
    public void last() {
        if (comic != null) {
            currentPage = totalPages;
        }
    }

    @Override
    public void zoom(int percentage) {
        if (comic != null) {

            if (percentage <= MAX && percentage >= MIN){
                zoom = percentage;
                System.out.println("Reader on zoom: " + zoom);
            }
            else {
                System.out.println("Wrong percentage");
            }
        }
    }

    @Override
    public void nightReadingMode(boolean state) {
        if (comic != null){
            nightReading = state;
            System.out.println("night reading mode is on: " + nightReading);
        }
    }

    @Override
    public String toString() {
        return "SimpleComicReader{" +
                "comic=" + comic +
                ", currentPage=" + currentPage +
                ", totalPages=" + totalPages +
                ", zoom=" + zoom +
                ", nightReader=" + nightReading +
                '}';
    }
}
