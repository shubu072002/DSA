class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int start  =0;
        int ZeroCount =0;
        int max = 0;
        for(int end=0;end<n;end++){
           if(nums[end]==0){
            ZeroCount++;
           }
           while(ZeroCount>k){
             if(nums[start]==0){
                ZeroCount--;
             }
             start++;
           }
           max=Math.max(max,end-start+1);
        }
        return max;
    }
}