class Solution {
    int l1;
    int l2;
    int l3;
    public boolean isInterleave(String s1, String s2, String s3) {
        l1=s1.length();
        l2=s2.length();
        l3=s3.length();
        if(l1+l2!=l3){
            return false;
        }
        int[][] dp = new int[l1+2][l2+2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(s1,s2,s3,0,0,0,dp);
    }
    public boolean helper(String s1, String s2, String s3, int i, int j, int k, int[][] dp){
        if(i==l1 && j==l2 && k==l3){
            return true;
        }
        boolean x = false;
        boolean y = false;

        if(dp[i][j]!=-1){
            return dp[i][j]==1;
        }

        if(i<l1 && s1.charAt(i)==s3.charAt(k)){
            x= helper(s1,s2,s3,i+1,j,k+1,dp);
        }
        if(j<l2 && s2.charAt(j)==s3.charAt(k)){
            y= helper(s1,s2,s3,i,j+1,k+1,dp);
        }
        dp[i][j]=(x||y)?1:0;
        return x||y;
    }
}