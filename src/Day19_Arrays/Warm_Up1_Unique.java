package Day19_Arrays;
import java.util.Scanner;

public class Warm_Up1_Unique {
    public static void main(String[] args) {
        /*
        write a program that return the unique characters from a string
        Example:"AABCC">>>>>"B
         */

       /* Scanner scan = new Scanner(System.in);
        String word=scan.next();

        int lastindex=word.length()-1;
        String result="";

        for (int i=0;i<=lastindex;i++){
            if (!result.contains(""+word.charAt(i))){
                result+=word.charAt(i);
            }

        }
        System.out.println(result);*/


        String str = "orhano";

        for (int j = 0; j <= str.length() - 1; j++) {
            int count = 0;

            String result = "";  //"B">>must be returned

            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (count == 1) {
                result += str.charAt(j);

            }
            System.out.println(result);

        }


    }
}
