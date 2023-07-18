public class Main {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,11,15,18} ;
        int target = 5;

        System.out.println(binarySearch(arr , target));
    }
    static int binarySearch(int[]arr,int target){

        int start=0;
        int end = arr.length-1;

        if(arr.length==0){
            return -1;
        }

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