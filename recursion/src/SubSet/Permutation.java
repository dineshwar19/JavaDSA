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
            String sec = pro.substring(i );
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
            String sec = pro.substring(i );
            ans.addAll(permutation1(first+ch+sec , unPro.substring(1)));
        }
        return ans;
    }
    static ArrayList<String> permutation3(String pro , char[] unPro ,int index) {
//        String pro = "";
//        char[]unPro = {'a','b','c'};
//
//        System.out.println(permutation(pro,unPro , 0));
        if(index == unPro.length){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = unPro[index];
        ArrayList<String>ans = new ArrayList<>();
        for (int i = 0; i <= pro.length(); i++) {
            String f = pro.substring(0,i);
            String l = pro.substring(i);
            ans.addAll(permutation3(f + ch + l , unPro , index + 1));
        }
        return ans;
    }
}
