import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int len = scan.nextInt();
        double [] arr = new double[len];
        System.out.println("enter the items:");
        for (int i=0;i<len;i++){
            arr[i]= scan.nextDouble();
        }
        double min=arr[0];
        double max = arr[0];
        for (int i=0;i<len;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("The minimum number in the array is "+min);
        System.out.println("The maximum number in the array is "+max);
    }
}
