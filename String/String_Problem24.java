package String;
//Q--> word search
public class String_Problem24 {


        public boolean exist ( char[][] board, String word){

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean dfs ( char board[][], String word,int i, int j, int idx){
            if (i < 0 || j < 0 || i == board.length || j == board[0].length || word.charAt(idx) != board[i][j])
                return false;
            if (idx == word.length() - 1) {
                return true;
            }
            char temp = board[i][j];
            board[i][j] = '0';
             if(dfs(board, word, i + 1, j, idx + 1) ||
            dfs(board, word, i - 1, j, idx + 1) ||
                    dfs(board, word, i, j + 1, idx + 1) ||
                    dfs(board, word, i, j - 1, idx + 1)){
                 return true;
            }
            board[i][j] = temp;
            return false;

        }
    }

