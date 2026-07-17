//Q9-Minimise the maximum difference between heights [V.IMP]

import java.util.Arrays;

public class Array_Problem9 {
   static int getMinDiff(int[] arr, int n, int k  ){
        if(n==1){
            return 0 ;
        }
        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        int min , max;

        for(int i=1;i<n;i++){
            if(arr[i]-k<0){
                continue;
            }
            max = Math.max(arr[i-1]+k, arr[n-1]-k);
            min = Math.min(arr[i]-k, arr[0]+k);

            diff = Math.min(diff,max-min);
        }
       
       return diff;

    }
    public static void main(String[] args) {
    int[] a = {3,9,12,16,20};
    int n = a.length;
    int k=3;
   int x = getMinDiff(a, n, k);  
    System.out.println(x);
    }
}
