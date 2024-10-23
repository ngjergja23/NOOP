package calc;

public record CalculationFormData(double fst, double snd, double res, Operation operationStrategy) {

    @Override
    public String toString() {
        return "CalculationFormData{" +
                "fst=" + fst +
                ", snd=" + snd +
                ", res=" + res +
                ", operationStrategy=" + operationStrategy +
                '}';
    }
}
