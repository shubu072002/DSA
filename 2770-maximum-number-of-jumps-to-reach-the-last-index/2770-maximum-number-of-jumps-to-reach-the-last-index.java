class Solution {

    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
         int[] dp = new int[n+5];
        Arrays.fill(dp, -2);
        int ans =  helper(nums, 0, target,n, dp);
       
        return ans<=0?-1:ans;
    }
    public int helper(int[] nums, int i, int target, int n, int[] dp){
        if(i==n-1){
            return 0;
        }
        if(dp[i]!=-2){
            return dp[i];
        }
        int max = Integer.MIN_VALUE;
        for(int j=i+1;j<n;j++){
            if(Math.abs(nums[j]-nums[i])<=target){
                int curr = 1 + helper(nums,j,target,n, dp);
                max = Math.max(max, curr);
            }
        }
        return dp[i] = max;
    }
}