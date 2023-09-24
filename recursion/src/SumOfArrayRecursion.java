public class SumOfArrayRecursion {
    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5};
        System.out.println(sumOfNumbers(5));
    }
    static int sumOfArray(int[]arr , int index){
        if(index == arr.length){
            return 0;
        }
        return arr[index] + sumOfArray(arr,index + 1);
    }
    static int sumOfNumbers(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfNumbers(n - 1);
    }
}
