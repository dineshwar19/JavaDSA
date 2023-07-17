public class Main {
    public static void main(String[] args) {
        //Linear Search
        int[]arr={1,4,6,9,11,44};
        int target=6;
        System.out.println(linearSearch(arr,target));
    }
    static int linearSearch(int[]arr,int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}