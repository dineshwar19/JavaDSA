public class fibonacciSeries {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacciRecursion(n));
    }
    static int fibonacciRecursion(int n){
        if(n < 2){
            return n;
        }
        return fibonacciRecursion(n-1) + fibonacciRecursion(n - 2);
    }
}
