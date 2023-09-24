public class ReverseAnArrayInRecursion {
    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5};
        reverseAnArray(arr,arr.length-1);
    }
    static void reverseAnArray(int[]arr,int index){
        if (index < 0){
            return;

        }
        System.out.print(arr[index]);
        reverseAnArray(arr,index - 1);
    }
}
