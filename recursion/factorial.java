public class factorial {
    public static void main(String[] args) {
        int n =8;
        System.out.println(factorialRecursion(n));
    }
    static int factorialRecursion(int n){
        if(n < 2){
            return 1;
        }
        return n * factorialRecursion(n-1);
    }
}
