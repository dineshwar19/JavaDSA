import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //reversing an array
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = scan.nextInt();

        int [] arr = new int[len];
        System.out.print("Enter the element in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println("The array before reverse: "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("The array after reverse: "+Arrays.toString(arr));
    }
    public static int[] reverse(int []arr){
        int start = 0;
        int end = arr.length-1;
        for (int i= 0; i< arr.length; i++) {
                if (start<end){
                    swap(arr,start,end);
//                    int temp= arr[start];
//                    arr[start]=arr[end];
//                    arr[end]=temp;
            }
                start++;
                end--;
        }
        return arr;
    }
    public static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
