package repete_strategy;

public class TestApp {

    public static void main(String[] args) {

        ControllerContent cc = new ControllerContent();
        String data = "aabbcc";
        String filepath = "DATA/fst_file.txt";
        cc.writeContent2File(data, filepath);

        cc.setWriteStrategy(new BWStrategy());
        cc.writeContent2File(data, filepath);

    }

}
