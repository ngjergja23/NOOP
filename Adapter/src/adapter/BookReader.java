package adapter;

public interface BookReader {

    void viewPage(int numPage) throws PageOutOfRange;

    void nextPage();

    void previousPage();

    int activePage();

    void goToLastPage();

    void goToFirstPage();

    void zoom(int percentage);

}
