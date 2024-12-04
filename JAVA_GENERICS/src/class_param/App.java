package class_param;

public class App {

    public static void main(String[] args) {

        Package<String> stringPackage = new Package<>(String.class);
        stringPackage.addNewElement("Novi");
        stringPackage.addNewElement("Novi2");
        stringPackage.listContent();

        Package<Integer> intPackage = new Package<>(Integer.class);
        intPackage.addNewElement(1);
        intPackage.addNewElement(2);
        intPackage.listContent();

    }

}
