import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//  Write a Java program to find the factorial of a number.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        long factorial = calculateFactorial(num);
        System.out.println("The factorial of the " +num+ " is "+factorial);
    }

    public static long calculateFactorial(int num){
        int fact = 1;
        if (num<0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        else {
            for (int i = 1 ;i<=num;i++){
                fact*=i;
            }
        }
        return fact;
    }
}