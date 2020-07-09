package Interview_Prep;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q4_Find_Unique {
    /*
    Write a return  method that can find the unique characters from the String

    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static void main(String[] args) {

        String word = "AAABBBCCCDEF";
        String r1 = unique(word);
        System.out.println(r1);

    }

    public static String unique(String str) {

        String result = "";
        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            if (count == 1) {
                result += str.charAt(j);
            }
        }

        return result;


    }


}
