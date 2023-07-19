
public class FloorNumber {
    public static void main(String[] args) {
        int [] arr = {22,18,15,13,11,8,5,3,1};
        int target = 6;
        System.out.println(ceilingNumber(arr,target));
    }
    static int ceilingNumber(int[]arr,int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        while (start<=end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target<arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }

            }

        }
        if(isAsc){
            return end;
        }else
            return start;
    }
}

