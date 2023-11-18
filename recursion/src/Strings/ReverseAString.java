package Strings;

public class ReverseAString {
    public static void main(String[] args) {

    }
    static void reverseAString(String unPro ) {
        if(unPro.isEmpty()){
            return;
        }
        char ch = unPro.charAt(unPro.length() - 1);
        System.out.print(ch);
        reverseAString(unPro.substring(0 , unPro.length() - 1));
    }
    static void reverseAString1(String str , int index) {
        if(index < 0){
            return;
        }
        System.out.print(str.charAt(index));
        reverseAString1(str,index - 1);
    }

    static String reverseAString2(String unPro,String pro ) {
        if(unPro.isEmpty()){
            return pro;
        }
        char ch = unPro.charAt(unPro.length() - 1);
        pro += ch;
        return reverseAString2(unPro.substring(0 , unPro.length() - 1) , pro);
    }
}
