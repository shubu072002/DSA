package String;

public class String_Problem14 {
    public int editDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }
      return helper(s1,s2,0,0,dp);
    }
    public int helper(String s1,String s2, int i,int j,int[][] dp){
        int n = s1.length();
        int m = s2.length();
        int ans = 0;
        //base case
        if(i==n){
            return m-j;
        }
        if(j==m){
            return n-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        //if charcter match
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=helper(s1,s2,i+1,j+1,dp);
        }
        else {
            //recursive function
            //insert
            int insert = 1 + helper(s1, s2, i, j + 1,dp);
            //delete
            int delete = 1 + helper(s1, s2, i + 1, j,dp);
            //replace
            int replace = 1 + helper(s1, s2, i + 1, j + 1,dp);

            ans = Math.min(insert, Math.min(delete, replace));
        }
        return dp[i][j]=ans ;
    }
    public static void main(String[] args) {

    }
}
