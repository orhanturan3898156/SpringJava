package Replits;

public class Replit172 {
    public static void main(String[] args) {
        /*
        x
            at3("longword","foo")
            will return: "lonfoogword"

            at3("blabla","a")
            will return: "blaabla"
         */


        String target = "longword";
        String word = "foo";

        String result = at3(target, word);
        System.out.println(result);

    }

    public static String at3(String target, String word) {

        String result = "";

        for (int i = 0; i < 3; i++) {
            result += target.charAt(i);

        }

        result += word;

        for (int i = 3; i < target.length(); i++) {
            result += target.charAt(i);
        }


        return result;


    }
}
