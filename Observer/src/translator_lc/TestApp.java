package translator_lc;

public class TestApp {

    public static void main(String[] args) {

        String txt = "Ovo je tekst za prijevod..";

        Translator tr = new Translator();
        tr.setTranslate(new FRATranslate());
        tr.translateText(txt);

        tr.setTranslate(new ENGTranslate());
        tr.translateText(txt);
    }

}

// ovaj pristup treba preferirati
// programiranje prema sučeljima
