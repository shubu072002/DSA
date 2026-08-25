class Solution {
    public void swap(int[] nums, int s ,int e){
        int temp = nums[s];
        nums[s]=nums[e];
        nums[e]= temp;
    }
    public void sortColors(int[] nums) {
        int idx = 0;
        int start =0;
        int end = nums.length-1;
        while(idx<=end){
            if(nums[idx]==2){
                swap(nums,idx,end);
                end--;
            }
            else if(nums[idx]==0){
                swap(nums,idx,start);
                start++;
                idx++;
            }
            else{
                idx++;
            }
        }
    }
}