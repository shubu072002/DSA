package Blind150.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        backtrack(resList, new ArrayList<>(), nums);
        return resList;
    }

    public void backtrack(List<List<Integer>> resList, List<Integer> tempList, int[] nums) {
        //Basecase
        if (tempList.size() == nums.length) {
            resList.add(new ArrayList<>(tempList));
            return;
        }
        for (int Number : nums) {
            if (tempList.contains(Number)) {
                continue;
            }

            //add number
            tempList.add(Number);

            //backtrack
            backtrack(resList, tempList, nums);

            //we did this while backtrack
            tempList.remove(tempList.size() - 1);
        }
    }
}
