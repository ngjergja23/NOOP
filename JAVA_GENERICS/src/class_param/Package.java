package class_param;

import java.util.ArrayList;

public class Package <T> {

//    private String name; // moze imati i neparam clanove

    private final ArrayList<T> content;  //referenca na arrayList se nece mijenjati, ali sam sadrzaj liste moze tj. necemo moci koristiti setterese
    private Class<T> classType;

    public Package(Class<T> classType) {
        this.classType = classType;
        this.content = new ArrayList<>();
        System.out.println("Created package object with " + classType);
    }

//    public void setContent(ArrayList<T> content){
//        this.content = content;
//    }

    public void listContent(){
        if (this.content.isEmpty()){
            System.out.println("List empty!");
        }else {
            for (T c : this.content){
                System.out.println("element: " + c);
            }
        }
    }

    public void addNewElement(T newElement){
        if (content.contains(newElement)){
            System.out.println("Already Exists! ");
        }else {
            content.add(newElement);
            System.out.println("New element added! ");
        }
    }



}
