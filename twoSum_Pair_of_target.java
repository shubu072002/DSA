import java.util.Arrays;
import java.util.HashMap;

public class twoSum_Pair_of_target {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int first = nums[i];
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,9};
        int target = 7;
        int[] a  =twoSum(arr,target);
        System.out.println(Arrays.toString(a));
    }
}