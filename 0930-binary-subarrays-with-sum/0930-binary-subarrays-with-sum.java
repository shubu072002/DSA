class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int currSum =0;
        int count =0;
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            if(map.containsKey(currSum-goal)){
                count+=map.get(currSum-goal);
            }
            map.put(currSum, map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}