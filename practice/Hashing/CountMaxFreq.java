package practice.Hashing;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class CountMaxFreq {
    public static int maxFrequencyElements(int[] nums) {
        int ans=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> element: map.entrySet()){
            if(element.getValue()>max){
                max = element.getValue();
            }
        }

        for(Map.Entry<Integer, Integer> element: map.entrySet()){
            if(element.getValue()==max){
                ans+=element.getValue();
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,2,2,3,1,4};
        int ans = maxFrequencyElements(nums);
        System.out.println(ans);
    }
}
