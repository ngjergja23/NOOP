package adapter;

public class Adapter implements ComicReader{


    private BookReader bookReader;

    public Adapter(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    @Override
    public void goToPage(int numPage) throws PageOutOfRange {
        bookReader.viewPage(numPage);
    }

    @Override
    public void next() {
        bookReader.nextPage();
    }

    @Override
    public int currentPage() {
        return bookReader.activePage();
    }

    @Override
    public void previous() {
        bookReader.previousPage();
    }

    @Override
    public void first() {
        bookReader.goToFirstPage();
    }

    @Override
    public void last() {
        bookReader.goToLastPage();
    }

    @Override
    public void zoom(int percentage) {
        bookReader.zoom(percentage);
    }

    @Override
    public void nightReadingMode(boolean state) {
        System.out.println("Sorry, this method is not provided for that");
    }
}
