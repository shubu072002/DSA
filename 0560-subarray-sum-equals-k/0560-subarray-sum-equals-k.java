class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count =0;
        int currSum = 0;
        map.put(0,1);
        for(int i=0;i<n;i++){
          currSum = currSum+nums[i];
          if(map.containsKey(currSum-k)){
            count+=map.get(currSum-k);
          }
          map.put(currSum, map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}