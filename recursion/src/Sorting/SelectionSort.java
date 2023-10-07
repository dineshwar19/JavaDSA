package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr ={4, 1, 2, 6 , 3};
        selectionSort(arr, 0, arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[]arr ,int currentIndex , int lastIndex , int maxValue){
        if(lastIndex == 0){
            return;
        }
        if(currentIndex <= lastIndex){
            if(arr[currentIndex] > arr[maxValue]){
                selectionSort(arr,currentIndex + 1,lastIndex,currentIndex);
            }else{
                selectionSort(arr,currentIndex + 1,lastIndex,maxValue);
            }
        }else {
            int temp = arr[maxValue];
            arr[maxValue] = arr[lastIndex ];
            arr[lastIndex ] = temp;
            selectionSort(arr, 0, lastIndex - 1, 0);
        }

    }
}
