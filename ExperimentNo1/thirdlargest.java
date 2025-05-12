import java.util.*;
public class thirdlargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        System.out.print("Enter array elements: ");
        for(int i=0;i<5;i++){
           a[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            for(int j=i+1;j<5;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                }
            }
        }
        System.out.println("Thir largest element is: "+a[2]);

    }
    
}
