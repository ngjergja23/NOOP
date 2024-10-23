package calc;

import java.util.List;

public interface SaveDataStrategy<E> {  //btw kad je txt je String, kad je bin je Object tako da parametriziramo :)

    void saveDataToFile(String filePath, List<E> data);

}
