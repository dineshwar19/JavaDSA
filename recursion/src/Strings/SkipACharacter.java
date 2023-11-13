package Strings;

public class SkipACharacter {
    public static void main(String[] args) {
        String str = "cvbvaadad";
        String ans = "" ;
//        skipACharacter(str , ans, 0 , 'a');

//        skip(ans , str , 'a');

        System.out.println(skip2(str , 'a'));
    }
    static void skipACharacter(String str , String ans , int index ,char ch){
        if(index == str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(index) != ch){
            ans += str.charAt(index);
        }
        skipACharacter(str,ans,index + 1 , ch);
    }
    static void skip(String pro , String unPro , char c){
        if(unPro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = unPro.charAt(0);
        if(ch == c){
            skip(pro , unPro.substring(1) , c);
        }else{
            skip(pro + ch , unPro.substring(1) , c);
        }
    }
    static String skip2(String unPro , char c){
        if(unPro.isEmpty()){
            return "";
        }
        char ch = unPro.charAt(0);
        if(ch == c){
            return  skip2(unPro.substring(1) , c);
        }else{
            return ch + skip2(unPro.substring(1) , c);
        }
    }
}
