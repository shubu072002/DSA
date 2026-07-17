package Blind75.Greedy;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length;
       int finalDestination = n-1;
       for(int i=n-2;i>=0;i--){
           if(i+nums[i]>=finalDestination){
               finalDestination=i;
           }
       }
       return finalDestination==0;
    }
}
