import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int []arr={555,901,482,1771};
        System.out.println(even(arr));
    }
    static int even(int[]arr){
        int count=0;
        for (int num:arr) {
            int digitCount=digit(num);
            if (digitCount%2==0){
                count++;
            }
        }
        return count;
    }
    static int digit(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
