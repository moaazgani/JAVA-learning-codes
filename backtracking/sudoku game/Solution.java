class Solution {
    public boolean isSafe(char[][] board, int col, int row, int num) {
        //row & col
        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char) (num + '0')){
                return false;
            }
        }
        for(int j=0; j<board.length; j++){
            if(board[row][j] == (char) (num + '0')){
                return false;
            }
        }
        // And now calculate for grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i = sr; i< sr+3; i++){
            for(int j = sc; j <sc+3; j++){
                if(board[i][j] == (char) (num + '0')){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int col, int row) {
        if(row == board.length){
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            if (helper(board, ncol, nrow)) {
                return true;
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, col, row, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, ncol, nrow)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
