public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        int start = 0;
        int end = str.length() - 1;
        System.out.println(palindromeCheck(str, start, end));
    }

    static boolean palindromeCheck(String str, int start, int end) {
        if(start > end){
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return palindromeCheck(str, start + 1, end - 1);
    }
}
