import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//  Write a Java program to check if a number is prime.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        boolean isPrime=true;
        if (num ==0 || num ==1){
            isPrime=false;
        }
        for (int i=2;i<num;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num+" is prime");
        }
        else
            System.out.println(num+" is not prime");
    }
}