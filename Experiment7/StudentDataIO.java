import java.io.*;
import java.util.Scanner;

public class StudentDataIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get student info from user
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Weight (kg): ");
        float weight = scanner.nextFloat();

        System.out.print("Enter Height (cm): ");
        float height = scanner.nextFloat();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();

        // 2. Write to file using DataOutputStream
        try {
            FileOutputStream fos = new FileOutputStream("student.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeFloat(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);

            dos.close();
            fos.close();

            System.out.println("\nStudent data saved successfully!\n");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // 3. Read from file using DataInputStream
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            DataInputStream dis = new DataInputStream(fis);

            String rName = dis.readUTF();
            int rAge = dis.readInt();
            float rWeight = dis.readFloat();
            float rHeight = dis.readFloat();
            String rCity = dis.readUTF();
            String rPhone = dis.readUTF();

            dis.close();
            fis.close();

            // 4. Display the data
            System.out.println("=== Student Information ===");
            System.out.println("Name   : " + rName);
            System.out.println("Age    : " + rAge);
            System.out.println("Weight : " + rWeight + " kg");
            System.out.println("Height : " + rHeight + " cm");
            System.out.println("City   : " + rCity);
            System.out.println("Phone  : " + rPhone);

        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
