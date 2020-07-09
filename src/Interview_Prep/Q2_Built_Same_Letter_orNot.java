package Interview_Prep;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Q2_Built_Same_Letter_orNot {
    /*

    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:
     */

    public static void main(String[] args) {

        String word1 = "abccd";
        String word2 = "cabe";

        boolean r1 = sameLetter2(word1, word2);
        System.out.println(r1);


    }

    public static boolean sameLetter(String str1, String str2) {

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result = Arrays.equals(arr1, arr2);
        return result;


    }

    public static boolean sameLetter2(String str1, String str2) {

        String[] arr1 = str1.split("");
        String[] arr2 = str1.split("");

        Set<String> list1 = new TreeSet<>(Arrays.asList(arr1));
        Set<String> list2 = new TreeSet<>(Arrays.asList(arr2));
        String a=arr1.toString();
        String b=arr2.toString();

        return a.equals(b);
        /*
        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

        return  str1.equals(str2);
         */

    }
}
