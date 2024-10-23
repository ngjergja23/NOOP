package calc;

import java.util.List;

public interface SaveDataStrategy {  //btw kad je txt je String, kad je bin je Object tako da parametriziramo :)

    <E> void saveDataToFile(String filePath, List<E> data);

}
