class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        int majority1 = 0;
        int majority2 = 0;

        int vote1 = 0;
        int vote2 = 0;

        for(int i=0;i<nums.length;i++){
            if(vote1==0 && nums[i]!=majority2){
                majority1=nums[i];
                vote1++;
            }
            else if(vote2==0 && nums[i]!=majority1){
                majority2=nums[i];
                vote2++;
            }
            else if(nums[i]==majority1){
                vote1++;
            }
            else if(nums[i]==majority2){
                vote2++;
            }
            else{
                vote1--;
                vote2--;
            }
        }
        int freq1 =0;
        int freq2 =0;
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]==majority1){
                freq1++;
            }
            else if(nums[i]==majority2){
                freq2++;
            }
        }
        
        if(freq1>n){
            res.add(majority1);
        }
        if(freq2>n){
            res.add(majority2);
        }
        return res;
    }
}