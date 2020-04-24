package Day14_String_Class;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        /*
        Enter 3 words
        -if they are same lenght: print "All words are same lenght;
        -if some lenght and others not: Not same nor different
        -if all different: All different lenght
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 words please");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();

        int lenght1 = word1.length();
        int lenght2 = word1.length();
        int lenght3 = word1.length();
        boolean notsame = lenght1 != lenght2 && lenght2 != lenght3 && lenght1 != lenght3;

        if (!notsame) {
            System.out.println("all same");
        }


    }
}
