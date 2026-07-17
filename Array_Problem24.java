import java.util.Arrays;
import java.util.HashSet;

public class Array_Problem24 {
   public static int subsequence(int[] arr) {
       int n = arr.length;
       if(arr.length==1)return 1;
       HashSet<Integer> set = new HashSet<>();
       for(int i=0;i<n;i++){
           set.add(arr[i]);
       }
       int maxlen=1;
       for(Integer element: set){
           int prev = element-1;
           if(!set.contains(prev)){
               int len=1;
               int nextele =element+1;
               while (set.contains(nextele)){
                   len++;
                   nextele++;
               }
               maxlen= Math.max(maxlen,len);
           }
       }

       return maxlen;

   }
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        System.out.println(subsequence(arr));

    }
}
