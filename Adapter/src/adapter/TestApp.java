package adapter;

public class TestApp {

    public static void main(String[] args) {

        Comic comic = new Comic("Captain America", "DT & CH", 263);
        SimpleComicReader scr = new SimpleComicReader();
        scr.setComic(comic);

        Client client = new Client();
        client.setComicReader(scr);
        client.activePage();
//        client.goTo(12);
        client.turNightModeON();


        Book book = new Book("The last principle", "S.G. Marty", 230);
        SimpleBookReader sbr = new SimpleBookReader(book);
        sbr.setBook(book);

        Adapter adapter = new Adapter(sbr);
        client.setComicReader(adapter);        //<--
        client.turNightModeON();


    }

}
