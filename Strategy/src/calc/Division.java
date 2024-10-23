package calc;

public class Division implements Operation{

    @Override
    public double calculate(double num1, double num2) {

        if (num2 == 0){
            throw new ArithmeticException("Division by zero not possible!");
        }else {
            return num1 / num2;
        }

    }

    @Override
    public String toString() {
        return "Division";
    }
}
