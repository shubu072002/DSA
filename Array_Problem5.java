//Q  -Move all the negative elements to one side of the array
import java.util.Scanner;

public class Array_Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=-1;
        for(int i =0;i<n;i++){
            if(arr[i]<0){
                j++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
