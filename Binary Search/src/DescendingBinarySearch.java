public class DescendingBinarySearch {
    public static void main(String[] args) {
        int [] arr = {90, 80, 70, 60, 50, 6, 4, 2, 1};
        int target = 90;

        System.out.println(descendingBinarySearch(arr , target));
    }
    static int descendingBinarySearch(int[]arr,int target){

        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0){
            return -1;
        }
        while(start<=end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                start = mid + 1;
            }else if(target > arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
