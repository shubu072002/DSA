class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
    set.add(num);
}
        int n = nums.length;
        int min = Integer.MAX_VALUE; ;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           min = Math.min(min,nums[i]);
           max = Math.max(max,nums[i]);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                 res.add(i);
            }
        } 
        return res;
    }
}