package translator_lc;

public class Translator {

    private Translate translate;  //ne moze bit final(Fra ili Eng?)


    public void setTranslate(Translate translate) {
        this.translate = translate;
    }

    public void translateText(String text){
        translate.translate(text);          //delegira se njemu/njima
    }
}


//lc bolji nacin rada