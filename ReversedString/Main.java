import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//  Write a Java program to reverse a string.
        Scanner scan = new Scanner(System.in);
        int i;
        System.out.println("Enter the String: ");
        String name = scan.nextLine();
        String rev=reversedString(name);
        System.out.println(rev);
        }
    public static String reversedString(String name){
        String rev="";
        int len = name.length();
        for (int i =len-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        return rev;
    }
}
