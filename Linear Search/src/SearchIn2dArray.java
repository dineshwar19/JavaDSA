import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,4},
                {5,8,9},
                {6,7,3}
        };
        int target=3;

        System.out.println(Arrays.toString(search2dArray(arr,target)));
    }
    static int[] search2dArray(int[][]arr,int target){
        if (arr.length==0){
            return new int[]{-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1};
    }
}
