package translator_tc;

import javax.management.InvalidAttributeValueException;

public class Translator {

    private int choice;
    private final EnglishTranslator englishTranslator;
    private final FrenchTranslator frenchTranslator;

    public Translator(){
        System.out.println();
        englishTranslator = new EnglishTranslator();
        frenchTranslator = new FrenchTranslator();
    }

    public void setChoice(int num){
        choice = num;
    }

    public void translate(String text) throws InvalidAttributeValueException {

        switch (choice){
            case 1: {
                englishTranslator.translateText(text);
            } break;
            case 2: {
                frenchTranslator.translate(text);
            } break;
            default: {
                System.out.println("Expected 1 or 2");
                throw new InvalidAttributeValueException();
            }
        }

    }

}
