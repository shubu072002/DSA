package String;

import java.util.ArrayList;
import java.util.List;

public class String_Probem11 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutehelper(nums,0,ans);
        return ans;
    }
    public void permutehelper(int[] nums,int index,List<List<Integer>> ans ){
        int n = nums.length;
        //base
        if(index==n-1){
            List<Integer> sublist = new ArrayList<>();
            for(int element : nums){
                sublist.add(element);
            }
            ans.add(new ArrayList<>(sublist));
            return;
        }
        // actual logic
        for(int i=index;i<n;i++){
            swap(nums,index,i);
            permutehelper(nums,index+1,ans);

            //backtrack
            swap(nums,index,i);
        }
    }
    public void swap(int[] nums,int start, int end){
        int temp=nums[end];
        nums[end]=nums[start];
        nums[start]=temp;
    }
    public static void main(String[] args) {
        String_Probem11 p = new String_Probem11();
        int[] nums ={1,2,3};
        System.out.println(p.permute(nums));
    }
}
