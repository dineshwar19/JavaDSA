public class Main {
    public static final String alpha= "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        String message = "hello";
        int key = 3;
        String encrypt = encrypt(message , key);
        System.out.println(encrypt);
        System.out.println(decrypt(encrypt , key));
    }
    static String encrypt(String plainText , int key){

        plainText = plainText.toLowerCase();
        String encryption = "";
        for (int i = 0; i < plainText.length(); i++) {
            int message =alpha.indexOf(plainText.charAt(i));
            int charPosition = (message + key) % 26 ;
            char word = alpha.charAt(charPosition);
            encryption+=word;
        }
        return encryption;
    }
    static String decrypt(String encrypt, int key){
        encrypt = encrypt.toLowerCase();
        String decryption = "";
        for (int i = 0; i < encrypt.length(); i++) {
            int message = alpha.indexOf(encrypt.charAt(i));
            int charPosition = (message - key) % 26 ;
            char word = alpha.charAt(charPosition);
            decryption+=word;
        }
        return decryption;
    }
}
