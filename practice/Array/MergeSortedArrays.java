package practice.Array;

import java.util.Arrays;

public class MergeSortedArrays {
    public void mergeArrays(int a[], int b[]) {
       int n = a.length;
       int m = b.length;
       int k = a.length-1;
       int i=0;
       int j=0;
       while(i<=k && j<m){
           if(a[i]<b[j]){
               i++;
           }
           else {
               int temp = a[k];
               a[k]=b[j];
               b[j]=temp;
               k--;
               j++;
           }
       }
        Arrays.sort(a);
        Arrays.sort(b);

    }
    public static void main(String[] args) {

    }
}
