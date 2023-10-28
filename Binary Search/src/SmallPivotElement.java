public class SmallPivotElement {
    public static void main(String[] args) {
        int[]arr = {5,6,7,8,0,1,2,3,4};
        System.out.println(findMin(arr));
    }

        static int findMin(int[] arr) {
            if(arr.length == 0){
                return -1;
            }
            if(arr[0] <= arr[arr.length - 1]){
                return arr[0];
            }
            int start = 0;
            int end = arr.length - 1;
            while(start <= end){
                int mid = start + (end -  start ) / 2;

                if (arr[mid] > arr[mid + 1]){
                    return arr[mid + 1];
                }
                if(arr[start] <= arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            return arr[0];
        }
    }

