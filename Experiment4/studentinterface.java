import java.util.*;
class Student{
    int rollno;
    Scanner sc = new Scanner(System.in);
    void getrollno(){
        System.out.print("Enter roll no: ");
        rollno = sc.nextInt();
    }
    void setrollno(){
        System.out.println("Roll no: "+rollno);
    }
}
class Test extends Student{
    Scanner sc = new Scanner(System.in);

    float sub1,sub2;
    void getmarks(){
        System.out.print("Enter marks for sub1: ");
        sub1 = sc.nextFloat();
        System.out.print("Enter marks for sub2: ");
        sub2 = sc.nextFloat();
    }
    void setmarks(){
        System.out.println("Marks subject 1: "+sub1);
        System.out.println("Marks subejct 2: "+sub2);
    }
}
interface Sports{
    final float smarks = 15;
    void set();
}
class Result extends Test implements Sports {
    public void set(){
        System.out.println("Marks of Sports: "+smarks);
    }
    void Displaymarks(){
        setrollno();
        setmarks();
        set();
    }
    void calPercentage(){
        float percentage;
        percentage = (sub1+sub2+smarks)/2;
        System.out.println("Percentage is: "+percentage);
    }

}
public class studentinterface {
    public static void main(String[] args) {

        Result r1 = new Result();
        r1.getrollno();
        r1.getmarks(); 
        r1.Displaymarks();
        r1.calPercentage();
        
    }
    
}
