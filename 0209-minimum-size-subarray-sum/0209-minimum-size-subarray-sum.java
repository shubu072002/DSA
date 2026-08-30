class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end =0;
        int sum =0;
        int min = Integer.MAX_VALUE;
        int length = 0;
        while(end<nums.length){
           sum+=nums[end];
           while(sum>=target){
           length = end-start+1;
           min = Math.min(min,length);
            sum-=nums[start];
            start++;
           }
           end++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}