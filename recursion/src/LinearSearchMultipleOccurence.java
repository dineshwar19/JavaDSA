import java.util.ArrayList;

public class LinearSearchMultipleOccurence {
    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5, 6, 6};
        int target = 6;
        int index = 0;
//        ArrayList<Integer>list = linearSearch(arr,target,index,new ArrayList<>());
//        System.out.print(list);
        System.out.println(linearSearch(arr,target, index , new ArrayList<>() ));

    }
    static ArrayList<Integer> linearSearch(int[]arr , int target , int index , ArrayList<Integer>list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return linearSearch(arr,target,index + 1, list);
    }
}
