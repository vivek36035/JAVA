import java.util.*;
class Bank {
    double amount, totalamount = 0;

    void deposite() {
        System.out.println("Deposite Amount");
    }

    void withdraw() {
        System.out.println("Withraw Amount");
    }

}
class Savingsacc extends Bank {
    Savingsacc(double initialBalance) {
        totalamount = initialBalance;
    }

    void deposite() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter deposite amount: ");
        amount = sc.nextInt();
        if (amount > 0) {

            totalamount += amount;
            System.out.println("Available balance is: " + totalamount);
        }
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        if (totalamount <= 100) {
            System.out.println("You can't Withraw amount");
        } else {
            System.out.println("Enter Withdraw amount: ");
            amount = sc.nextInt();
            totalamount -= amount;
            System.out.println("Available balance is: " + totalamount);
        }
    }
}
public class bankaccount {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total amount in bankaccount: ");
        double initialBalance = sc.nextInt();
        Savingsacc s1 = new Savingsacc(initialBalance);
        s1.deposite();
        s1.withdraw();
    }
}
