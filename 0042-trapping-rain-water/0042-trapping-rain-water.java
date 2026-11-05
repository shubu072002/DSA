class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lmh = Integer.MIN_VALUE;
        int rmh = Integer.MIN_VALUE;
        int ans = 0;
        int i=0;
        int j = n-1;
        while(i<j){
            lmh = Math.max(lmh,height[i]);
            rmh = Math.max(rmh,height[j]);
            if(lmh<rmh){
                ans+=lmh-height[i];
                i++;
            }
            else{
                ans+=rmh-height[j];
                j--;
            }
        }
        return ans;
    }
}