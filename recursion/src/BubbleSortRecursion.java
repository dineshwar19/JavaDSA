import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[]arr = {4,5,3,2,1};
        bubbleSort(arr, arr.length -1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[]arr,int lastindex , int currentIndex){
        if(lastindex == 0){
            return ;
        }
        if(currentIndex < lastindex){
            if(arr[currentIndex] > arr[currentIndex + 1]){
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex + 1];
                arr[currentIndex + 1] = temp;
            }
            bubbleSort(arr, lastindex , currentIndex+1);
        }
        else{
            bubbleSort(arr,lastindex - 1 , 0);
        }
    }
}
