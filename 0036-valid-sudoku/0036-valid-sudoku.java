class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> set = new HashSet<>();
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){

           if(board[i][j]=='.'){
             continue;
           } 
           
           String row = board[i][j]+"in row"+i;
           String col = board[i][j]+"in col"+j;
           String box = board[i][j]+"in box"+i/3+"-"+j/3;

           if(!set.add(row) || !set.add(col) || !set.add(box)){
             return false;
           }
        }
       }
       return true;
    }
}