class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character> rows= new HashSet<>();
            HashSet<Character> cols= new HashSet<>();
            HashSet<Character> quad= new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'&&!rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.'&&!cols.add(board[j][i]))
                    return false;
                int rowq=3*(i/3);
                int colq=3*(i%3);
                if(board[rowq+j/3][colq+j%3]!='.'&& !quad.add(board[rowq+j/3][colq+j%3]))
                    return false;
            }
        }
        return true;

    }
}