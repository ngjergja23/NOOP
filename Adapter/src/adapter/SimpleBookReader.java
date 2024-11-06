package adapter;

public class SimpleBookReader implements BookReader{

    private Book book;
    private int currentPage;
    private int totalPages;
    private static final int MAXP = 150;
    private static final int MINP = 55;
    private int zoom;


    public SimpleBookReader(Book book) {
        System.out.println("Ready to read books...\n Please provide some comics: ");
        this.book = book;
    }

    public void setBook(Book book) {
        this.book = book;
        this.currentPage = 1;
        this.totalPages = book.getNumOfPages();
        this.zoom = 100;
    }

    @Override
    public void viewPage(int numPage) throws PageOutOfRange {
        if (this.book != null){
            if (numPage <= totalPages){
                currentPage = numPage;
                System.out.println("Reader on the page: " + currentPage);

            }else {
                throw new PageOutOfRange();
            }
        }
    }

    @Override
    public void nextPage() {
        if (this.book != null){
            if (currentPage < totalPages){
                currentPage++;
                System.out.println("Reader on the page: " + currentPage);
            }
        }
    }

    @Override
    public void previousPage() {
        if (this.book != null){
            if (currentPage > 1){
                currentPage--;
                System.out.println("Reader on the page: " + currentPage);
            }
        }
    }

    @Override
    public int activePage() {
        return currentPage;
    }

    @Override
    public void goToLastPage() {
        if (this.book != null){
            currentPage = totalPages;
            System.out.println("Reader on the page: " + currentPage);
        }
    }

    @Override
    public void goToFirstPage() {
        if (this.book != null){
            currentPage = 1;
            System.out.println("Reader on the page: " + currentPage);
        }
    }

    @Override
    public void zoom(int percentage) {
        if (book != null) {

            if (percentage <= MAXP && percentage >= MINP){
                zoom = percentage;
                System.out.println("Reader on zoom: " + zoom);
            }
            else {
                System.out.println("Wrong percentage");
            }
        }
    }

    @Override
    public String toString() {
        return "SimpleBookReader{" +
                "book=" + book +
                ", currentPage=" + currentPage +
                ", totalPages=" + totalPages +
                ", zoom=" + zoom +
                '}';
    }
}
