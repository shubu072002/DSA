class Solution {
    public int minOperations(int[] nums, int x) {
      int n = nums.length;
      int total = 0;
      for(int i=0;i<n;i++){
        total+=nums[i];
      }
      int target = total-x;
      int left =0;
      int right =0;
      int sum = 0;
      int maxLength = Integer.MIN_VALUE;
      while(right<n){
        sum+=nums[right];
        while(left<=right && sum>target){
            sum-=nums[left];
            left++;
        }
        if(sum==target){
            maxLength = Math.max(maxLength, right-left+1);
        }
        right++;
      }
       return maxLength==Integer.MIN_VALUE?-1:n-maxLength; 
    }
}