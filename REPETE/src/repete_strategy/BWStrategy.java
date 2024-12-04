package repete_strategy;

import java.io.*;

public class BWStrategy implements WriteStrategy{


    @Override
    public void write2file(String data, String filepath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filepath), true))) {
            bw.write(data);
            bw.write(System.lineSeparator());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
