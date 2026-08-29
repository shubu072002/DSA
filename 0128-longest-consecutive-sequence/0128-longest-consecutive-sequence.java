class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int n = nums.length;
        int max= 0;
        for(int element: set){
           int prev = element-1;
           if(!set.contains(prev)){
            int length = 1;
            int nextelement  = element+1;
            while(set.contains(nextelement)){
                length++;
                nextelement++;
            }
            max = Math.max(max,length);
           }
        }
        return max;
    }
}