import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = scan.nextInt();

        int [] arr = new int[len];
        System.out.print("Enter the element in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println("The array before swap: "+Arrays.toString(arr));
        System.out.print("Enter the 1st index to swap: ");
        int index1=scan.nextInt();

        System.out.print("Enter the 2nd index to swap: ");
        int index2=scan.nextInt();
        swap(arr,index1,index2);
        System.out.println("The array after swap: "+Arrays.toString(arr));
    }
    public static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
