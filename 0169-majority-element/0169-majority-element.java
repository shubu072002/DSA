class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int vote =1;
        for(int i=1;i<nums.length;i++){
            if(majorityElement==nums[i]){
                vote++;
            }
            else if (vote==0){
                majorityElement=nums[i];
            }
            else{
                vote--;
            }
        }
        return majorityElement;
    }
}