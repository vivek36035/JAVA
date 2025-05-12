import java.util.*;

abstract class Employee {
    String name;
    String address;
    double sallary;
    String jobTitle;

    Employee(String n, String a, double s, String j) {
        name = n;
        address = a;
        sallary = s;
        jobTitle = j;
    }

    abstract void calbonus();

    void generatingperformance() {
    }

    void managingProjects() {
    }

    void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + sallary);
    }
}

class Manager extends Employee {
    int numofprojects;

    Manager(String n, String a, double s, String j, int numofprojects) {
        super(n, a, s, j);
        this.numofprojects = numofprojects;
    }

    void managingProjects() {
        System.out.println(jobTitle + "Managing Proects " + numofprojects);
    }

    void calbonus() {
        double totalsalary = sallary * (0.10) + (500 * numofprojects) + sallary;
        System.out.println("Total Salary: " + totalsalary);
    }
}

class Developer extends Employee {
    int numofprojects;

    Developer(String n, String a, double s, String j, int numofprojects) {
        super(n, a, s, j);
        this.numofprojects = numofprojects;
    }

    void managingProjects() {
        System.out.println(jobTitle + "Managing Proects " + numofprojects);
    }

    void calbonus() {
        double totalsalary = sallary * (0.15) + (400 * numofprojects) + sallary;
        System.out.println("Total Salary: " + totalsalary);
    }
}

class Programmer extends Employee {
    int NumOfLine;

    Programmer(String n, String a, double s, String j, int NumOfLine) {
        super(n, a, s, j);
        this.NumOfLine = NumOfLine;
    }

    void managingProjects() {
        System.out.println(jobTitle + "Managing Proects Code " + NumOfLine);
    }

    void calbonus() {
        double totalsalary = sallary * (0.15) + (10 * NumOfLine) + sallary;
        System.out.println("Total Salary: " + totalsalary);
    }
}

public class employe {
    public static void main(String[] args) {
        Manager m1 = new Manager("Vivek", "Sangli", 50000, "Manager", 5);
        System.out.println("Manger Details");
        m1.displayinfo();
        m1.managingProjects();
        m1.calbonus();
        System.out.println();

        Developer d1 = new Developer("Dhanaraj", "KavtheMahankal", 40000, "Developer", 5);
        System.out.println("Developer Details");
        d1.displayinfo();
        d1.managingProjects();
        System.out.println();

        Programmer p1 = new Programmer("Ganesh", "Kurundwad", 35000, "Programmewr", 500);
        System.out.println("Programmer Details");
        p1.displayinfo();
        d1.managingProjects();
        d1.calbonus();
    }

}
