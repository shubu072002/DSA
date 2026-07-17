package Blind75.ArrayAndHashing;

import java.util.HashSet;

public class ValidSudoko {
    public boolean isValidSudoku(char[][] board){
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num = board[i][j];

                if(num=='.'){
                    continue;
                }
                String row = num+"in row"+i;
                String col = num+"in col"+j;
                String box = num+"in box"+(i/3)+"-"+(j/3);

                if(!set.add(row) || !set.add(col) || !set.add(box)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        ValidSudoko validSudoko = new ValidSudoko();
        char[][] board = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','1','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(validSudoko.isValidSudoku(board));


    }

}
