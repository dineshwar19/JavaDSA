public class Main {
    public static void main(String[] args) {
        int[]arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[]arr,int target){

        int start=0;
        int end = arr.length-1;


        while (start<=end){
            int mid = start + (end - start)/2;

            if (target<arr[mid]) {
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}