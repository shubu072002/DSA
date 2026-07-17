package practice.Array;

import java.util.Arrays;

public class ReverseAnArray {
    public static void reverseArray(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr =  {1, 4, 3, 2, 6, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
