class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n;i++){
          if(nums[i]%2!=0){
            nums[i]=1;
          }
          else{
            nums[i]=0;
          }
         }

        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        int currSum =0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            if(map.containsKey(currSum-k)){
                count+=map.get(currSum-k);
            }
            map.put(currSum, map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}