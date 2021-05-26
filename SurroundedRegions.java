//130. Surrounded Regions
/**
 * Given an m x n matrix board containing 'X' and 'O', capture all regions surrounded by     'X'.
 *
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
**/
class Solution {
    public void solve(char[][] board) {
        for (int i=0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 'O') {
                    board[i][j] = 'N';
                }
            }
        }
        for (int i=0; i < board.length; i++) {
                for (int j=0; j<board[i].length; j++) {
                    if ((j==0 || j==board[i].length - 1 || i==0 || i==board.length-1) && board[i][j] == 'N') {
                        fillBoard(i,j,board);
                    }
                }
            }
        for (int i=0; i < board.length; i++) {
                for (int j=0; j<board[i].length; j++) {
                    if (board[i][j] == 'N') {
                        board[i][j] = 'X';
                    }
                }
            }
        
        
    }
    private void fillBoard(int i, int j, char[][] board){
        
        if (board[i][j] == 'N') { 
            board[i][j] = 'O';
        } else {
            return;
        }
        
        //fill neighbours
        //above
        if (i-1 >=0 && board[i-1][j]=='N') {
            fillBoard(i-1,j,board);
        }
        //left
        if (j-1 >=0 && board[i][j-1]=='N') {
            fillBoard(i,j-1,board);
        }
        //right
        if (j+1 < board[i].length && board[i][j+1]=='N') {
            fillBoard(i,j+1,board);
        }
        //below
        if (i+1 < board.length && board[i+1][j]=='N') {
            fillBoard(i+1,j,board);
        }
        return;
    }
}
