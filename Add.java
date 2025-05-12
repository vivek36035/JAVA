import java.util.*;

public class Add {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, rem, add = 0;
        System.out.print("Enter number: ");
        num = sc.nextInt();

        while (num > 0) {
            rem = num % 10;
            add +=rem;
            num /= 10;

        }
        System.out.println("The reveres number is: " + add);

    }
}
