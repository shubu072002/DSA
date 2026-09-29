class Solution {
    int n;
    int m;
    Boolean[][][] dp;
    public boolean hasValidPath(char[][] grid) {
         n = grid.length;
         m = grid[0].length;
        if((n+m-1)%2!=0){
            return false;
        }
        if(grid[0][0]==')' || grid[n-1][m-1]=='('){
            return false;
        }
        dp=new Boolean[n+5][m+5][n+m+5];
      
        return helper(0,0,0,grid);
    }
    public boolean helper(int i, int j, int open, char[][] grid){
        if(grid[i][j]=='('){
            open++;
        }
        else{
            open--;
        }

        if(open<0){
            return false;
        }

        if(i==n-1 && j==m-1){
            return open==0;
        }

        if(dp[i][j][open]!=null){
            return dp[i][j][open];
        }

        boolean x = false;
        boolean y = false;
        
        //move down
        if (i + 1 < n) {
            x = helper(i + 1, j, open, grid);
        }

        // Move right
        if (j + 1 < m) {
            y = helper(i, j + 1, open, grid);
        }

        return dp[i][j][open] =  x||y;

    }
}