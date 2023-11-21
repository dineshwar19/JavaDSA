package BackTracking;

import java.util.ArrayList;
public class Maze {
    public static void main(String[] args) {
        boolean[][]maze = {
                {true , true ,true},
                {true , false , true},
                {true , true , true}
        };
        pathObstacles("",0,0,maze);


    }
//    counting of paths
    static int maze(int row , int col ){
        if(row == 1 || col == 1){
            return 1;
        }
        int count = 0;
        count = count + maze(row - 1, col  );
        count = count + maze(row - 1 , col - 1);//for diagonal path
        count = count + maze (row , col - 1 );
        return count;
    }

//    printing of paths without returning it.
    static void printPaths(String pro , int row , int col){
        if(row == 1 && col == 1){
            System.out.print(pro + " ");
            return;
        }
        //        for diagonal path
        if(row > 1 && col> 1){
            printPaths(pro + "f" , row - 1 , col - 1);
        }
        if(row > 1) {
            printPaths(pro + "D", row - 1, col);
        }
        if(col > 1) {
            printPaths(pro + 'R', row, col - 1);
        }
    }
//    printing an arrayList with all possible paths
    static ArrayList<String> printPathsRet(String pro , int row , int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        //        for diagonal path
        if(row > 1 && col> 1){
            ans.addAll(printPathsRet(pro + "f" , row - 1 , col - 1));
        }
        if(row > 1) {
            ans.addAll(printPathsRet(pro + "D", row - 1, col));
        }
        if(col > 1) {
            ans.addAll(printPathsRet(pro + 'R', row, col - 1));
        }
        return ans;
    }

//    printing paths from 0 to target
    static void printPaths1(String pro , int row , int col, int target){
        if(row == target && col == target){
            System.out.print(pro + " ");
            return;
        }
        if(row < target && col < target){
            printPaths1(pro+ "f" , row + 1, col + 1,target); // f - because in the keyboard f is in between the R and D
        }
        if(row < target) {
            printPaths1(pro + "D", row + 1, col,target);
        }
        if(col < target) {
            printPaths1(pro + 'R', row, col + 1,target);
        }
    }
//    printing paths without obstacles
    static void pathObstacles(String pro , int row , int col, boolean[][]maze){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.print(pro + " ");
            return;
        }
        if(!maze[row][col]){
            return;
        }

        if(row < maze.length - 1 ) {
            pathObstacles(pro + "D", row + 1, col,maze);
        }
        if(col < maze[0].length - 1) {
            pathObstacles(pro + 'R', row, col + 1,maze);
        }
    }
}