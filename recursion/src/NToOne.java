public class NToOne {
    public static void main(String[] args) {
        nToOne(5);
    }
    static void nToOne(int n){
        if(n == 0){
            return;
        }
        System.out.print(n);
        nToOne(n - 1);
    }
}
