package translator_tc;

import javax.management.InvalidAttributeValueException;

public class TestApp {

    public static void main(String[] args) {

        Translator tr = new Translator();

        tr.setChoice(1);
        try {
            tr.translate("Ovo je tekst za prijevod");
        } catch (InvalidAttributeValueException e) {
            System.out.println(e.getMessage());
        }

    }
}
