package calc;

public class Multiplication implements Operation{

    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public String toString() {
        return "Multiplication";
    }
}
