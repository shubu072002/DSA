//Q-find Largest sum contiguous Subarray [V. IMP]

import java.util.Scanner;

public class Array_Problem8 {
    static void maxSubArray(int[] arr){
        int cursum =0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cursum = cursum + arr[i];
            if(cursum>maxsum){
                maxsum = cursum;
            }
            if (cursum<0) {
                cursum =0;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");    
    int n =sc.nextInt();
    int[] a = new int[n];
    for(int i =0;i<n;i++){
        a[i]=sc.nextInt();
    }
    maxSubArray(a);
    }
}
