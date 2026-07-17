package String;

import java.util.Arrays;

public class String_Problem22 {
    int countPS(String s) {
        int n = s.length();
        int[][] dp= new int[n+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,n-1,s,dp);
    }
    int helper(int i,int j,String s,int[][] dp){
        if(i>j) return 0;
        if(i==j) return 1;

        if(dp[i][j]!=-1)return dp[i][j];

        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j] = 1 + helper(i,j-1,s,dp) + helper(i+1,j,s,dp);
        }
        else {
            return dp[i][j] = helper(i,j-1,s,dp) + helper(i+1,j,s,dp) - helper(i+1,j-1,s,dp);
        }
    }
    public static void main(String[] args) {

    }
}
