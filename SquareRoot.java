public class SquareRoot implements CalculatorOperation {
    
    public double calculate(double a, double b) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
       
