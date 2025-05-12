import java.util.*;
public class matrix1 {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int a[][] = new int[2][2];
            int b[][] = new int[2][2];
            int c[][] = new int[2][2];
    
            System.out.println("Enter first matrix: ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
    
            System.out.println("Enter second matrix: ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    c[i][j] = a[i][j]+b[i][j];
                }
            }
             System.out.println("Addition matrix is: ");
             for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    c[i][j] = a[i][j] - b[i][j];
                }
            }
            System.out.println("Substraction matrix is: ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    c[i][j]=0;
                    for(int k=0;k<2;k++){
                        c[i][j] += a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Multiplication matrix is: ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    b[j][i] = a[i][j];
                }
            }
            System.out.println("Transpose of first matrix: ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
        }   
    }
