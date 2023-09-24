public class SortedArrayOrNot {
    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 3, 6};
        int index = 0;
        System.out.println(sortedOrNot(arr, index));

    }
    static boolean sortedOrNot(int[]arr , int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sortedOrNot(arr, index + 1);
    }
}
