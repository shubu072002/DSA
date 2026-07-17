package Blind75.ArrayAndHashing;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        //prefix
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i] = nums[i-1] * ans[i-1];
        }
        int suffix = 1;
        for(int j=n-1;j>=0;j--){
            ans[j]=suffix * ans[j];
            suffix = suffix * nums[j];
        }
       return ans;
    }
}
