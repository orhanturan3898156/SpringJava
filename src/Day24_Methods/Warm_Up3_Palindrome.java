package Day24_Methods;

public class Warm_Up3_Palindrome {

    public static void palindrome(String str) {
        str = str.toLowerCase();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(str.equals(reversed));
    }

    public static void main(String[] args) {
        palindrome("level");
        palindrome("Orhan");


    }
}
