public class FIndTargetInMountainArray {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,3,2,1};
        int target = 5;
        System.out.println(findInMountainArray(arr,target));
    }
    public static int findInMountainArray( int[] mountainArr,int target) {
        int peak = peakIndex(mountainArr);
        if(target < mountainArr[peak]){
            return search(mountainArr,target,0,peak);
        }
        else{
            return search(mountainArr,target,peak,mountainArr.length-1);
        }

    }
    static int peakIndex(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid  = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int search(int[]arr ,int target ,int start ,int end){
        boolean isAsc = arr[start]<arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
