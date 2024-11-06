package adapter;

public class Client {

    private ComicReader comicReader;

    public void setComicReader(ComicReader comicReader) {
        this.comicReader = comicReader;
    }

    public void firstPAge(){
        comicReader.first();
    }
    public void lastPage(){
        comicReader.last();
    }
    public void activePage(){
        comicReader.currentPage();
    }
    public void nextPage(){
        comicReader.next();
    }
    public void turNightModeON(){
        comicReader.nightReadingMode(true);
    }
    public void goTo(int page){
        try {
            comicReader.goToPage(page);
        } catch (PageOutOfRange e) {
            System.out.println(e.getMessage());
        }
    }
    public void zoom(){
        comicReader.zoom(50);
    }

}
