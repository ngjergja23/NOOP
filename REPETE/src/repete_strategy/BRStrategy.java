package repete_strategy;

import java.io.*;

public class BRStrategy implements ReadStrategy{
    @Override

    public void read4file(String filepath) {

        try(BufferedReader br = new BufferedReader(new FileReader(new File(filepath)))){
            String line;
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
