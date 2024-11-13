package adapter;

public interface ComicReader {

    void goToPage(int numPage) throws PageOutOfRange;

    void next();

    int currentPage();

    void previous();

    void first();

    void last();

    void zoom(int percentage);

    void nightReadingMode(boolean state);


}
