import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        System.out.println("Fibonacci series up to " + num + ":");

        int n1= 0;
        int n2= 1;
        int fibonacci = 0;
        while (n1 <= num) {
            System.out.print(n1 + " ");

            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
    }
}
