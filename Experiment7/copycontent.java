import java.io.*;
public class copycontent
{

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("copy.txt");
            FileOutputStream fout = new FileOutputStream("copy1.txt");

            int a = 0;
            while((a=fin.read())!=-1)
            {
                fout.write(a);
            }

            fin.close();
            fout.close();
        }catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
