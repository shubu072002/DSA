package Blind150.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        helper(res, nums, 0, new ArrayList<>());
//        return res;
//    }
//    public void helper(List<List<Integer>> res, int[] nums, int index, List<Integer> sublist){
//        if(index==nums.length){
//            res.add(new ArrayList<>(sublist));
//            return;
//        }
//
//        // pic
//        sublist.add(nums[index]);
//        helper(res, nums, index+1, sublist);
//        //backtrack
//        sublist.remove(sublist.size()-1);
//
//        //not pic
//        helper(res, nums, index+1, sublist);
//    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), res);
        return res;
    }
    public void helper(int index, int[] nums, List<Integer> curr, List<List<Integer>> res){
        res.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            helper(index+1, nums , curr, res);
            curr.remove(curr.size()-1);
        }
    }
}
