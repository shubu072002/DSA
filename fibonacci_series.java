import java.util.Scanner;

public class fibonacci_series {
    public static int fibonacci(int n ){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a limit");    
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<=x;i++) {
            System.out.print(fibonacci(i)+ " ");
        }

    }
}
