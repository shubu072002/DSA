import java.util.*;
public class Array_Problem18 {
    public static int getpairSum(int[] a, int sum){
       int n = a.length;
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int i=0;i<n;i++){
               hm.put(a[i],hm.getOrDefault(a[i],0)+1);
       }
       int count =0;
       for(int i=0;i<n;i++){
       int complement = sum - a[i];

       if(hm.get(complement)!=null){
           count += hm.get(complement);
       }
       if(complement==a[i]){
           count--;
       }
       }
       return count/2;
    }

    public static void main(String[] args) {
        int[] a = {1,5,5,7,-1};
        int sum =10;
        System.out.println("Total no. of pair: "+getpairSum(a,sum));

    }
}