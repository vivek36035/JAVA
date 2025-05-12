import java.util.*;

class employe {
    String fname;
    String lname;
    double monthlysallary;
    double yearlysalary;

    employe(String f, String l, double s) {
        fname = f;
        lname = l;
        monthlysallary = s;
    }

    void getter() {
        System.out.println("first name: " + fname);
        System.out.println("last name: " + lname);
        System.out.println("Monthly sallary is: " + monthlysallary);
        if (monthlysallary > 0) {
            this.monthlysallary = monthlysallary;
        } else {
            this.monthlysallary = 0;
        }
    }

    void yearlysallary() {
        yearlysalary = monthlysallary * 12;
        System.out.println("Yearly Sallary is: " + yearlysalary);
    }

    void rise() {
        double raisesalary;
        raisesalary = monthlysallary * 0.1;
        yearlysalary = raisesalary + (monthlysallary * 12);
        System.out.println("Updated sallary is: " + yearlysalary);
    }
}

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employe e1 = new employe("Vivek", " Zambre", 0);
        employe e2 = new employe("Dhanraj", " Bhosale", 100000);

        System.out.println("First Employee Details");
        e1.getter();
        e1.yearlysallary();
        e1.rise();

        System.out.println();
        System.out.println("Second Employee Details");
        e2.getter();
        e2.yearlysallary();
        e2.rise();

    }
}
