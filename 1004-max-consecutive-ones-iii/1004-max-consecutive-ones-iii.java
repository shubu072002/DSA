class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int start =0;
        int end =0;
        int zeroCount =0;
        int max = Integer.MIN_VALUE;
        while(end<n){
            if(nums[end]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
            }
            if(zeroCount<=k){
                int length = end-start+1;
                max = Math.max(max, length);
            }
            end++;
        }
        return max;
    }
}