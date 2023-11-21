package BackTracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 1;
        boolean[][]board = new boolean[n][n];
        nKnights(board , 0 , 0 , n);
    }
    static void nKnights(boolean[][]board , int row , int col , int knight){
        if(knight == 0){
            display(board);
            System.out.println();
            return;
        }
        if(row == board.length - 1 && col == board.length){
            return;
        }
        if(col == board.length){
            nKnights(board , row + 1 , 0 , knight);
            return;
        }
        if(isKnight(board , row,  col)){
            board[row][col] = true;
            nKnights(board , row , col + 1, knight - 1);
            board[row][col] = false;
        }
        nKnights(board , row , col + 1,knight);
    }

    static boolean isKnight(boolean[][] board, int row, int col) {

        if(isValid(board,row - 1,col - 2)){
            if(board[row - 1][col - 2]){
                return false;
            }
        }
        if(isValid(board,row - 1,col + 2)){
            if(board[row - 1][col + 2]){
                return false;
            }
        }
        if(isValid(board,row - 2,col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }
        if(isValid(board,row - 2,col - 1)){
            return !board[row - 2][col - 1];
        }

        return true;
    }
    static boolean isValid(boolean[][]board , int row , int col){
        return (row >=0 && row < board.length ) && (col >= 0 && col < board.length);
    }
    private static void display(boolean[][] board) {
        for (boolean[] arr :
                board) {
            for (boolean ele :
                    arr) {
                if(ele){
                    System.out.print("K ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
