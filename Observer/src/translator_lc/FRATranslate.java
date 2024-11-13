package translator_lc;

public class FRATranslate implements Translate {

    @Override
    public void translate(String text) {
        System.out.println("To translate: " + text);
        System.out.println(getClass().getSimpleName() + " performing translation..");
    }

}
