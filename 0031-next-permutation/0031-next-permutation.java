class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums, int start, int end ){
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot =-1;
        for(int i=n-1;i>=0;i--){
          if(i>0 && nums[i-1]<nums[i]){
            pivot = i-1;
            break;
          }
        }
        int next_idx=-1;
        if(pivot!=-1){
            for(int i=n-1;i>pivot;i--){
                if(nums[i]>nums[pivot]){
                    next_idx=i;
                    break;
                }
            }
            swap(nums,pivot,next_idx);
        }
        reverse(nums, pivot+1, n-1);
    }
}