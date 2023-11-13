package SubSet;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutation("" , "abc");
    }
    static void permutation(String pro , String unPro){
        if(unPro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = unPro.charAt(0);
        for (int i = 0; i <= pro.length(); i++) {
            String first = pro.substring(0 , i);
            String sec = pro.substring(i , pro.length());
            permutation(first+ch+sec , unPro.substring(1));
        }
    }
    static ArrayList<String> permutation1(String pro , String unPro){
        if(unPro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = unPro.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= pro.length(); i++) {
            String first = pro.substring(0 , i);
            String sec = pro.substring(i , pro.length());
            ans.addAll(permutation1(first+ch+sec , unPro.substring(1)));
        }
        return ans;
    }
}
