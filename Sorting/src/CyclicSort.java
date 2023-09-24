import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int []arr = {5, 2, 4, 3, 5, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[]arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else {
                i++;
            }
        }
    }
}
