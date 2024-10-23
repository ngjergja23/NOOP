package calc;

public class Calculator {

    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void performOperation(double num1, double num2) {
        double res = this.operation.calculate(num1, num2);
        System.out.println(res);
    }
}
