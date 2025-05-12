import math.emp;
import math.submath.empsub;
import java.util.*;
public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.print("Enter a: ");
        a = sc.nextInt();

        emp e1 = new emp();
        e1.fact(n);
        e1.cube(n);

        empsub es1 = new empsub();
        es1.convertor(a);
    }
}
