import java.util.ArrayList;

public class LinearSearchWithoutPassingAnArgument {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,5},5,0));

    }
    static ArrayList<Integer>search(int[]arr,int target, int index){
        ArrayList<Integer>list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> collection = search(arr,target,index + 1);
        list.addAll(collection);
        return list;

    }
}
