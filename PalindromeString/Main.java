import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//  Write a Java program to check if a string is a palindrome.
        Scanner scan = new Scanner(System.in);
        int i;
        System.out.println("Enter the String: ");
        String name = scan.nextLine();
        String rev="";
        int len = name.length();

        boolean isPalindrome=true;

        for (i=0;i<len/2;i++ ){
            if (name.charAt(i)!=name.charAt(len-1-i)){
                isPalindrome=false;
                break;
            }

        }
        if (isPalindrome)
            System.out.println("It is palindrome");
        else
            System.out.println("it is not palindrome" );


    }
}
