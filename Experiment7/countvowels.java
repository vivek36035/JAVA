import java.io.*;
public class countvowels {
    public static void main(String[] args) throws IOException , FileNotFoundException{
        int count = 0;
        FileInputStream fin = new FileInputStream("vowels.txt");
        char ch;
        int a;
        do{
            a= fin.read();
            ch = (char)a;
            if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'){
                count++;
            }
        }while(a!=-1);
        System.out.println("Count is: "+count);
    }
}
