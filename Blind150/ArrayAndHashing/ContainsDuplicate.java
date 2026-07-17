package Blind75.ArrayAndHashing;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int element : nums){
            if(set.contains(element)){
                return true;
            }
            set.add(element);
        }
        return false;
    }
}
