public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 7, 9, 11, 14};
        int target = 4;

        System.out.println(agnosticBS(arr , target));
    }
    static int agnosticBS(int[]arr ,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscOrder = (arr[start] < arr[end]);

        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAscOrder){
                if (target < arr[mid]){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }else {
                if (target < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }

        }
        return -1;

    }
}
