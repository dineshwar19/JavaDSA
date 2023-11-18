package SubSet;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dice1("" , 4));
    }
    static void dice(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(p + i , target - i);
        }
    }
    static ArrayList<String> dice1(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            ans.addAll(dice1(p + i , target - i));
        }
        return ans;
    }
}
