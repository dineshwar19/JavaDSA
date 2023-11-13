package SubSet;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        String up = "";
        System.out.println(subSequence1(up , str));
    }
    static void subSequence(String pro , String unPro){
        if(unPro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = unPro.charAt(0);
        subSequence(pro + ch , unPro.substring(1));
        subSequence(pro , unPro.substring(1));
    }
    static ArrayList<String> subSequence1(String pro , String unPro){
        if(unPro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = unPro.charAt(0);
        ArrayList<String> left = subSequence1(pro + ch , unPro.substring(1));
        ArrayList<String> right = subSequence1(pro , unPro.substring(1));

        left.addAll(right);
        return left;
    }
}
