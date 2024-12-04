package repete_command;

import java.util.ArrayList;

public class TestApp {

    public static void main(String[] args) {

        Car car1 = new Car("audi", "a4");
        Car car2 = new Car("kia", "ceed");
        Car car3 = new Car("dacia", "sand");


        ArrayListController alc = new ArrayListController();

        ArrayList<Car> cars = new ArrayList<>();

        AddNewElement<Car> addCar1 = new AddNewElement<>(cars, car1);
        AddNewElement<Car> addCar2 = new AddNewElement<>(cars,car2);
        AddNewElement<Car> addCar3 = new AddNewElement<>(cars,car3);


        alc.setCurrentCommand(addCar1);
        alc.runCommand();
        listElements(cars);
        alc.setCurrentCommand(addCar2);
        alc.runCommand();
        listElements(cars);
        alc.setCurrentCommand(addCar3);
        alc.runCommand();
        alc.undoCommand();
        alc.redoCommand();

    }

    private static <E> void listElements(ArrayList<E> list){

        if (!list.isEmpty()){
            System.out.println("****list****");
            for (E element : list){
                System.out.println(element);
            }
        }

    }

}
