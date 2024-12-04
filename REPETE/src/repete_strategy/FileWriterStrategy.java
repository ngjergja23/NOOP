package repete_strategy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterStrategy implements WriteStrategy{

    @Override
    public void write2file(String data, String filepath) {

        File file = new File(filepath);
        try {FileWriter fw = new FileWriter(file, true);
            fw.append(data);
            fw.append(System.lineSeparator());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
