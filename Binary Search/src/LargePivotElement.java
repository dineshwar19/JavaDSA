public class LargePivotElement {
    public static void main(String[] args) {
        int[]arr = {5,6,7,8,1,2,3,4};
        System.out.println(findMax(arr));
    }
        static int findMax(int[] arr) {
            if(arr.length == 0){
                return -1;
            }
            if(arr[0] <= arr[arr.length - 1]){
                return arr[arr.length - 1];
            }
            int start = 0;
            int end = arr.length - 1;
            while(start <= end){
                int mid = start + (end -  start ) / 2;

                if (arr[mid] > arr[mid + 1]){
                    return arr[mid];
                }
                if(arr[start] <= arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            return arr[arr.length - 1];
        }
    }

//https://chat.openai.com/share/11cb9609-b471-4aa6-866c-e33e92005f74