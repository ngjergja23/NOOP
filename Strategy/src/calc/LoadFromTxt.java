package calc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadFromTxt implements LoadDataStrategy<String>{

    @Override
    public List<String> loadDataFromFile(String filePath) {
        List<String> loadedData = new ArrayList<>();

        File file = new File(filePath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                loadedData.add(line);
            }
            br.close();
            System.out.println("Data read from a txt file! ");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return loadedData;

    }

}
