package calc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveToTxt implements SaveDataStrategy{

    @Override
    public <E> void saveDataToFile(String filePath, List<E> data) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            for (E element : data){
                bw.write((String) element);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
