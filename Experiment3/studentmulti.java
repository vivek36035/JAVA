import java.util.*;

class Student {
    String name;
    int rollno;
    float marks, sub1, sub2;

    void getter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();
    }

    void setter() {
        System.out.println("Name is: " + name);
        System.out.println("Roll no: " + rollno);
        System.out.println("Marks of sub1: " + sub1);
        System.out.println("Marks of sub2: " + sub2);
        System.out.println("Percentage: " + marks + "%");
    }
}

class Test extends Student {
    void getter1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for sub1: ");
        sub1 = sc.nextFloat();
        System.out.print("Enter marks for sub2: ");
        sub2 = sc.nextFloat();
    }
}

class Result extends Test {
    void result() {
        marks = (sub1 + sub2) / 2;
    }
}

public class studentmulti {
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.getter();
        r1.getter1();
        r1.result();
        r1.setter();
    }

}
