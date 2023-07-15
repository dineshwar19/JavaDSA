
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [][] arr = new int[3][3];
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scan.nextInt();

            }
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
