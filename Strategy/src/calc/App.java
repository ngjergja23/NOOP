package calc;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.setOperation(new Addition());
        calculator.performOperation(2,3);

        calculator.setOperation(new Division());
        calculator.performOperation(2,2);

    }
}
