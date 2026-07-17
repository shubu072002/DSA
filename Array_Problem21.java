import java.util.HashMap;
import java.util.HashSet;

public class Array_Problem21 {
    public static int findSum(int[] arr,int k){
      int count=0;
      int sum =0;
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<arr.length;i++){
          sum +=arr[i];
          if(sum==k){
              count++;
          }
          if(map.containsKey(sum-k)){
              count +=map.get(sum-k);
          }

          if(!map.containsKey(sum)){
              map.put(sum, map.getOrDefault(sum, 0) + 1);
          }
          else {
              map.put(sum, map.get(sum) + 1);
          }

      }
      return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k =3;
        System.out.println(findSum(nums,k));

    }
}
