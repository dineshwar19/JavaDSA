public class ReverseNumber {
    public static void main(String[] args) {
        reverse(10002);
    }
    static void reverse(int n){
        if(n % 10 == n){
            System.out.print(n);
            return ;
        }
        System.out.print(n % 10);
        reverse(n / 10);
    }
}
