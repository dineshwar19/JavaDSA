import java.util.Arrays;

public class AltFor2dArraySearch {
    public static void main(String[] args) {
        int[][]matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {11, 12, 14}
        };
        int target = 14;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] search(int[][]matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            int midRow = mid / cols ;
            int midCol = mid % cols ;

            if (matrix[midRow][midCol] == target){
                return new int[]{midRow, midCol};
            }
            else if (matrix[midRow][midCol] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
