package repete_strategy;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class FStrategy implements WriteStrategy{

    @Override
    public void write2file(String data, String filepath) {
        String [] lines = data.split(",");
        
    }
}
//jos dva nacina za dr