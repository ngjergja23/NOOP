package repete_strategy;

public class ControllerContent {

    private WriteStrategy writeStrategy;
    private ReadStrategy readStrategy;

    public ControllerContent() {
        this.writeStrategy = new FileWriterStrategy();
        System.out.println("Default Write Strategy created -> FileWriterStrategy");
        this.readStrategy = new BRStrategy();
        System.out.println("Default Read Strategy created -> BRStrategy");

    }

    public void setWriteStrategy(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
        System.out.println("Write Strategy set ");

    }

    public void setReadStrategy(ReadStrategy readStrategy) {
        this.readStrategy = readStrategy;
        System.out.println("Read Strategy set ");

    }

    public void writeContent2File(String data, String filepath){
        if (writeStrategy != null){
            writeStrategy.write2file(data, filepath);          //delegirali smo konkretnom od writeStrategya
            System.out.println("Data written to a file! ");
        }
    }

    public void readData4File(String filepath){
        readStrategy.read4file(filepath);
    }

}
