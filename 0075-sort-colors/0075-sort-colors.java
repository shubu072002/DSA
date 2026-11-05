class Solution {
    private static void swap(int[] nums, int i, int j){
       int temp  = nums[i];
       nums[i]=nums[j];
       nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int k = 0;
        int j = n-1;
        while(k<=j){
            if(nums[k]==2){
                swap(nums,k,j);
                j--;
            }
            else if(nums[k]==0){
                swap(nums,k,i);
                i++;
                k++;
            }
            else{
                k++;
            }
        }
    }
}