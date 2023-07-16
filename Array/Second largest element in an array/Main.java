import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Second largest element in an array
        int n=5;
        int [] arr={1, 4, 5, 3, 7};

        int max=Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]>secondMax && arr[i]<max){
                secondMax=arr[i];
            }
        }
        System.out.println("second largest element :"+secondMax);


    }
//    static int print2largest(int arr[], int n) {
//        // code here
//        int max=Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//
//        for(int i=0;i<n;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//
//        for(int i=0;i<n;i++){
//            if(arr[i]>secondMax&&arr[i]<max){
//                secondMax=arr[i];
//            }
//        }
//        return secondMax;

    }
