package math;
public class emp {
    public void fact(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial is: "+factorial);
    }
    public void cube(int n){
        System.out.println("Cube is: "+(n*n*n));
    }
    
}
