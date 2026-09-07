class Solution {
    int M = 1000000007;
    int[] dp;
    int[] prev;
    public int distinctSubseqII(String s) {
        int n = s.length();
        dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        prev=new int[n+1];
        int[] lastseen = new int[26];
        for(int i=1;i<=n;i++){
            int idx = s.charAt(i-1)-'a';
            prev[i]=lastseen[idx];
            lastseen[idx]=i;
        }
        return ((solve(n)-1)+M)%M;
    }
    public int solve(int n){
        // base case 
        if(n==0){
           return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int total = (int)(2L * solve(n-1))%M;
        if(prev[n]!=0){
            total = (total-solve(prev[n]-1)+M)%M;
        }
        return dp[n]=total;
    }
    
}