package Blind150.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        helper(0, candidates, new ArrayList<>(), res, target);
        return res;
    }

    public void helper(int index, int[] nums, List<Integer> curr, List<List<Integer>> res, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(curr));
        }
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            curr.add(nums[i]);
            helper(i + 1, nums, curr, res, target - nums[i]);
            curr.remove(curr.size() - 1);
        }
    }

    public static class FibonacciSeries {
        public static int fib(int n ){
            if(n==0 || n==1){
                return n;
            }
            return fib(n-1)+fib(n-2);
        }
        public static void main(String[] args){
            int nthterm = FibonacciSeries.fib(6);
            System.out.println(nthterm);
        }
    }
}
