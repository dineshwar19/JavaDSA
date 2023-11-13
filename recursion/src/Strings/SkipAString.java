package Strings;

public class SkipAString {
    public static void main(String[] args) {
        String str = "heyareyouokay";
        String toFind = "hey";
        System.out.println(skip(str,toFind));

    }
    static String skip (String str , String toFind){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(str.startsWith(toFind)){
            return skip(str.substring(toFind.length()) , toFind);
        }else {
            return ch + skip(str.substring(1),toFind);
        }
    }
}
