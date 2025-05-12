import java.io.*;
public class OutSideFileDemo {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        try {
            FileInputStream fin = new FileInputStream("../outside.txt");
            int a;
            char ch;
            do {
                a = fin.read();
                ch = (char) a;
                System.out.print(ch);
            } while (a != -1);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
