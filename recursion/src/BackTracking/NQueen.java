package BackTracking;

public class NQueen {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        queen(board,0, 0, n );
    }
    static int nQueen(boolean[][]board , int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if(isQueen(board , row , col)){
                board[row][col] = true;
                count += nQueen(board , row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isQueen(boolean[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft = Math.min(row , col);
        for (int i = 1; i <= maxLeft ; i++) {
            if(board[row - i][col - i]){
                return false;
            }
        }
        int maxRight = Math.min(row , board.length - col - 1);
        for (int i = 1; i <= maxRight ; i++) {
            if(board[row - i][col + i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] arr :
                board) {
            for (boolean ele :
                    arr) {
                if(ele){
                    System.out.print("Q ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
    static void queen(boolean[][]board , int row , int col , int queen){
        if(queen == 0){
            display(board);
            System.out.println();
            return;
        }
        if(row == board.length){
            return;
        }
        if (col == board.length) {
            queen(board, row + 1, 0, queen);
            return;
        }
        if (isQueen(board, row, col)) {
            board[row][col] = true;
            queen(board, row + 1 , 0, queen - 1);
            board[row][col] = false;
        }

        queen(board, row, col + 1, queen);
    }
}
