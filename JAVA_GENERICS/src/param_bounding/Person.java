package param_bounding;

public abstract class Person {

    protected String name;

    protected Person(String name){ //bit ne podrzava da bude public
        this.name = name;
    }

    public abstract void someMethod();

}
