package Replits.String_Manupilation;

public class Replit65 {
    public static void main(String[] args) {
        /*
        You have a word, do the following:

        If the word has odd number of characters
        and has 5 or more characters, print the middle three
        characters of the word.

        Otherwise print "invalid".
         */
        String str=method("fif");
        System.out.println(str);



    }

    public static String method(String word) {
        String result = "";
        if (word.length() % 2 != 0 && word.length() >= 5) {
            return result = word.substring(0, 3);
        } else {
            return "Invalid";
        }


    }
}
