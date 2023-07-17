public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {1,4,2,5,7,3,11,82};
        int target=82;
        int start=1;
        int end=6;

        System.out.println(searchRange(arr,target,start,end));
    }
    static int searchRange(int []arr,int target,int start,int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
