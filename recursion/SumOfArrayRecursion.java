public class SumOfArrayRecursion {
    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5};
        System.out.println(sumOfArray(arr , 0));
    }
    static int sumOfArray(int[]arr , int index){
        if(index == arr.length){
            return 0;
        }
        return arr[index] + sumOfArray(arr,index + 1);
    }
}
