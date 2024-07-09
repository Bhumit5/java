package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(queens(new boolean[n][n],0));
    }

    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }

        int count = 0;
        // Placing the queen and checking for every row
        for (int col = 0; col < board.length; col++) {
            // Place the queen if it is safe
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check for vertical
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        // Check for diagonal Left
        int maxLeft = Math.min(row,col);
        for (int i = 0; i <= maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        // Check for diagonal Right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row:board) {
            for (boolean element:row) {
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
