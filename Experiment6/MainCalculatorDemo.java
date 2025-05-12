import ExceptionHandlingDemo.CalculatorDemo;
import ExceptionHandlingDemo.DivisionException;
import java.util.Scanner;

public class MainCalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorDemo calc = new CalculatorDemo();

        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        try {
            int result = calc.divide(a, b);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
