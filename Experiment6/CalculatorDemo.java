package  ExceptionHandlingDemo;

public class CalculatorDemo {
    public int divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Cannot divide by zero!");
        }
        return a / b;
    }
}
