public class Division implements CalculatorOperation {
   
    public double calculate(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
       
