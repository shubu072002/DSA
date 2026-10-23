class Solution {
    
     public boolean isValid(int x, int y, int[][] board){
            if(x<0 || y<0 || x>=board.length || y>=board[0].length){
               return false;
            }
            return true;
        }

    public void gameOfLife(int[][] board) {

        int[][] directions = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int no_of_live = 0;

                for(int[] dir: directions){
                    int x = i+dir[0];
                    int y = j+dir[1];

                    if(isValid(x,y,board) && Math.abs(board[x][y])==1){
                        no_of_live ++;
                    }
                }
                if(board[i][j]==1 && (no_of_live<2 || no_of_live>3)){
                    board[i][j]=-1;
                }
                if(board[i][j]==0 && no_of_live==3){
                    board[i][j]=2;
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(board[i][j]<=0){
                    board[i][j]=0;
                }
                if(board[i][j]==2){
                    board[i][j]=1;
                }
            }
        }

    }
}