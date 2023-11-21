package BackTracking;

import java.util.Arrays;

public class MazeBackTracking {
    public static void main(String[] args) {
        boolean[][]maze = {
                {true , true ,true},
                {true , true , true},
                {true , true , true}
        };
        int[][]path = new int[maze.length][maze[0].length];
        mazeWithPaths("" , 0 , 0 , maze,path,1);
    }
    static void mazeBacktracking(String pro , int row , int col, boolean[][]maze){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.print(pro + " ");
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;

        if(row < maze.length - 1 ) {
            mazeBacktracking(pro + "D", row + 1, col,maze);
        }
        if(col < maze[0].length - 1) {
            mazeBacktracking(pro + 'R', row, col + 1,maze);
        }
        if(row > 0){
            mazeBacktracking(pro + "U" , row - 1 , col , maze);
        }
        if(col > 0){
            mazeBacktracking(pro + "L" , row , col - 1 , maze);
        }
        maze[row][col] = true;
    }
    static void mazeWithPaths(String pro , int row , int col, boolean[][]maze , int[][]path , int step){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            path[row][col] = step;
            for (int[] arr :
                    path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(pro + " ");
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        path[row][col] = step;
        if(row < maze.length - 1 ) {
            mazeWithPaths(pro + "D", row + 1, col,maze, path , step + 1);
        }
        if(col < maze[0].length - 1) {
            mazeWithPaths(pro + 'R', row, col + 1,maze, path , step + 1);
        }
        if(row > 0){
            mazeWithPaths(pro + "U" , row - 1 , col , maze, path , step + 1);
        }
        if(col > 0){
            mazeWithPaths(pro + "L" , row , col - 1 , maze, path , step + 1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
