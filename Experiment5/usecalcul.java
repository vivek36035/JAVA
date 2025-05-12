import mypack.calcul;
import java.util.Scanner;
public class usecalcul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();

        calcul ob = new calcul();
        ob.add(a, b);
        ob.sub(a, b);
        ob.multi(a, b);
        ob.div(a, b);
    }
}
