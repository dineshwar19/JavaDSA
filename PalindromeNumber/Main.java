import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        palindrom number
        int num ,sum=0,mod, temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");

        num = in.nextInt();

        temp = num;

        while (num>0){
            mod = num%10;
            sum= (sum*10)+mod;
            num=num/10;
        }
        if (temp==sum){
            System.out.println("It is a palindrome number");
        }
        else {
            System.out.println("It is not a palindrome number");
        }
    }
}
