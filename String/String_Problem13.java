package String;
//Q->word wrap problem
public class String_Problem13 {
    public int solveWordWrap(int[] arr, int k) {
        int n = arr.length;
      int[][] dp = new int[n+1][k+1];
      for(int i=0;i<=n;i++){
          for(int j=0;j<=k;j++){
              dp[i][j]=-1;
          }
      }
      return helper(1,arr[0],arr,k,dp);
    }
    public int helper(int curr,int spaces,int[] arr,int k,int[][] dp){
        int n = arr.length;
        //base case
        if(curr==n){
            return 0;
        }
        //check the value in dp before moving forward
        if(dp[curr][spaces]!=-1){
            return dp[curr][spaces];
        }
        //option1 = continue on the same line
        int a = Integer.MAX_VALUE;
        int newspaces  = spaces+1+arr[curr];
        if(newspaces<=k){
            a=helper(curr+1,newspaces,arr,k,dp);
        }
        //option 2 = next line
        int b = (k-spaces)*(k-spaces)+helper(curr+1,arr[curr],arr,k,dp);
        return dp[curr][spaces]=Math.min(a,b);
    }
    public static void main(String[] args) {

    }
}
