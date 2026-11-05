class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            for(int j=i+1;j<n;j++){
              if(j!=i+1 && nums[j]==nums[j-1]){
                continue;
              }
              int k = j+1;
              int l = n-1;
              while(k<l){
                 long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                 if(sum==target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    list.add(nums[l]);
                    res.add(list);

                    while(k<l && nums[k+1]==nums[k]){
                        k++;
                    }
                    while(k<l && nums[l-1]==nums[l]){
                        l--;
                    }
                    k++;
                    l--;
                 }
                 else if(sum<target){
                    k++;
                 }
                 else{
                    l--;
                 }
              }
            }
        }
        return res;
    }
}