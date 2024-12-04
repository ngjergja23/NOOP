package repete_strategy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSStrategy implements WriteStrategy{

    @Override
    public void write2file(String data, String filepath) {
        try (FileOutputStream fos = new FileOutputStream(filepath, true)){
            String [] lines = data.split(",");
            fos.write(data.getBytes());
        } catch (IOException e) {
            System.out.println(e.getClass());
        }
    }
}
