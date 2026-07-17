package String;

import java.util.ArrayList;
import java.util.List;

public class subsetOfElements {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        subsethelper(nums,0,new ArrayList<>());
        return ans;
    }
    public void subsethelper(int[] nums,int index,List<Integer> sublist){
        //base case
        if(index==nums.length){
            ans.add(new ArrayList<>(sublist));
            return;
        }
        //include
        sublist.add(nums[index]);
        subsethelper(nums,index+1,sublist);
        sublist.remove(sublist.size()-1);

        //exclude
        subsethelper(nums,index+1,sublist);
    }
    public static void main(String[] args) {

    }
}
