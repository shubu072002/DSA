package String;

public class Lcs {
    public int longestCommonSubsequence(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();

        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return lcshelper(s1, s2, 0, 0,dp);
    }
    public int lcshelper(String s1, String s2, int i, int j,int[][] dp){
        int n=s1.length();
        int m=s2.length();
        if(i==n || j==m){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= 1 + lcshelper(s1,s2,i+1,j+1,dp);
        }
        else{
            return dp[i][j]= Math.max(lcshelper(s1,s2,i,j+1,dp),lcshelper(s1,s2,i+1,j,dp));
        }

    }
    public static void main(String[] args) {

    }
}
